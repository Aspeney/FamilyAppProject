package com.familyapp.familyapp;


import java.util.List;

public class FamilyRequest {

    public List<FamilyMemberRequest> members;

    String familyName;
    int nrOfInfants;
    int nrOfChildren;
    int nrOfAdults;


    public FamilyRequest() {


    }

    public FamilyRequest(String familyname, int familyNumber) {
    }


    public String getFamilyName() {return this.familyName;}
    public int getNrOfInfants() {
        return this.nrOfInfants;
    }

    public int getNrOfChildren() {
        return this.nrOfChildren;
    }
    public int getNrOfAdults() {
        return this.nrOfAdults;
    }

    public void setMembers(List<FamilyMemberRequest> members){
        this.members = members;
    }
}











