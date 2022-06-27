package com.familyapp.familyapp;

public class FamilyMemberResponse {

    String familyName;
    String givenName;
    int age;

    public FamilyMemberResponse(String familyName, String givenName, int age) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.age = age;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
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
}
