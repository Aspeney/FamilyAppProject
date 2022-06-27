package com.familyapp.familyapp;

public class FamilyMemberRequest {

    String familyName;
    String givenName;
    int age;

    public FamilyMemberRequest(String familyNameFromList, String givenNameFromList, int ageFromList) {

        this.familyName = familyNameFromList;
        this.givenName = givenNameFromList;
        this.age = ageFromList;


    }


    public FamilyMemberRequest() {

    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
