package com.familyapp.familyapp;


import java.util.List;

public class FamilyResponse {

    String familyName;
    int nrOfInfants;
    int nrOfChildren;
    int nrOfAdults;

    public List<FamilyMemberResponse> members;

    public FamilyResponse(String familyName, int nrOfInfants, int nrOfChildren, int nrOfAdults, List<FamilyMemberResponse> members) {
        this.familyName = familyName;
        this.nrOfInfants = nrOfInfants;
        this.nrOfChildren = nrOfChildren;
        this.nrOfAdults = nrOfAdults;
        this.members = members;
    }


    public List<FamilyMemberResponse> getMembers() {
        return members;
    }

    public void setMembers(List<FamilyMemberResponse> members) {
        this.members = members;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getNrOfInfants() {
        return nrOfInfants;
    }

    public void setNrOfInfants(int nrOfInfants) {
        this.nrOfInfants = nrOfInfants;
    }

    public int getNrOfChildren() {
        return nrOfChildren;
    }

    public void setNrOfChildren(int nrOfChildren) {
        this.nrOfChildren = nrOfChildren;
    }

    public int getNrOfAdults() {
        return nrOfAdults;
    }

    public void setNrOfAdults(int nrOfAdults) {
        this.nrOfAdults = nrOfAdults;
    }
}
