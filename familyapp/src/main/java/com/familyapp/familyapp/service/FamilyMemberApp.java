package com.familyapp.familyapp.service;

import com.familyapp.familyapp.FamilyMemberRequest;

import com.familyapp.familyapp.persistence.FamilyMember;
import com.familyapp.familyapp.persistence.FamilyMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyMemberApp {

    @Autowired
    FamilyMemberRepository familyMemberRepository;

    // zapisywanie członka rodziny w bazie danych
    public void createMember(FamilyMemberRequest memberRequest, int familyNumber){

        familyMemberRepository.save(new FamilyMember(memberRequest.getFamilyName(), memberRequest.getGivenName(), memberRequest.getAge(), familyNumber) );

    }

    // wyszukiwanie członków rodziny po numerze rodziny
    public List<FamilyMember> searchFamilyMember(int familyNumber){
        List<FamilyMember> familyMembers = familyMemberRepository.findByFamilyNumber(familyNumber);
        return familyMembers;
    }

}
