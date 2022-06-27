package com.familyapp.familyapp.service;

import com.familyapp.familyapp.FamilyMemberRequest;
import com.familyapp.familyapp.FamilyMemberResponse;
import com.familyapp.familyapp.FamilyRequest;
import com.familyapp.familyapp.FamilyResponse;
import com.familyapp.familyapp.persistence.Family;
import com.familyapp.familyapp.persistence.FamilyMember;
import com.familyapp.familyapp.persistence.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.random;


@Service
public class FamilyApp {

    @Autowired
    FamilyRepository familyRepository;

    @Autowired
    FamilyMemberApp familyMemberApp;


    // nadanie rodzinie indywidualnego numeru oraz zapisanie rodziny w bazie danych
    public int createFamily(FamilyRequest request) {
        //nadanie numeru rodziny
        Random rand = new Random();

        int max = 99999;
        int min = 10001;
        int familyNumber = (int) Math.floor(random() * (max - min + 1) + min);

        //sprawdzenie czy w bazie danych nie istnieje już rodzina o podanym nr
//        if(familyRepository.findByFamilyNumber(familyNumber) != null){
//            familyNumber = (int) Math.floor(random() * (max - min + 1) + min);
//        }

        validateFamilyData(request);

        for (FamilyMemberRequest member : request.members) {
            familyMemberApp.createMember(member, familyNumber);
        }
        familyRepository.save(new Family(request.getFamilyName(), request.getNrOfInfants(), request.getNrOfChildren(), request.getNrOfAdults(), familyNumber));
        return familyNumber;
    }

    // wyszukiwanie rodziny i jej członków po numerze rodziny
    public FamilyResponse getFamily(int familyNumber){
        Family family = familyRepository.findByFamilyNumber(familyNumber);
        List<FamilyMember> familyMembers = familyMemberApp.searchFamilyMember(familyNumber);

        List<FamilyMemberResponse> familyMemberResponseList=  new ArrayList<>();

        for (FamilyMember familyMember : familyMembers ) {
            familyMemberResponseList.add(new FamilyMemberResponse(familyMember.getFamilyName(), familyMember.getGivenName(), familyMember.getAge()));
        }
        FamilyResponse familyResponse = new FamilyResponse(family.getFamilyName(), family.getNrOfInfants(), family.getNrOfChildren(), family.getNrOfAdults(), familyMemberResponseList);
        return familyResponse;

    }

    // walidacja danych rodziny i członków rodziny
    public void validateFamilyData(FamilyRequest request) {

        int nrOfInfantsFromList = 0;
        int nrOfChildrenFromList = 0;
        int nrOfAdultsFromList = 0;




        {
            for (FamilyMemberRequest member : request.members) {
                if (member.getAge() < 4 && member.getAge() >= 0) {
                    nrOfInfantsFromList++;
                }
                if (member.getAge() >= 4 && member.getAge() < 16) {
                    nrOfChildrenFromList++;
                }
                if (member.getAge() >= 16) {
                    nrOfAdultsFromList++;
                }
                if (member.getAge() < 0 ) {
                    throw new IllegalArgumentException("Wiek nie może być mniejszy niż 0. Podaj prawidłowy wiek.");
                }


            }


            if (request.getNrOfInfants() != nrOfInfantsFromList) {
                throw new RuntimeException("Podana liczba niemowląt nie zgadza się z liczbą niemowląt na liście. Prosimy o ponowne wprowadzenie danych.");
            }

            if (request.getNrOfChildren() != nrOfChildrenFromList) {
                throw new RuntimeException("Podana liczba dzieci nie zgadza się z liczbą dzieci na liście. Prosimy o ponowne wprowadzenie danych.");
            }

            if (request.getNrOfAdults() != nrOfAdultsFromList) {
                throw new RuntimeException("Podana liczba dorosłych nie zgadza się z liczbą dorosłych na liście. Prosimy o ponowne wprowadzenie danych.");
            }

        }


    }



}













