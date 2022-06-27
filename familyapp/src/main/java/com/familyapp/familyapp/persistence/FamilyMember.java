package com.familyapp.familyapp.persistence;

import javax.persistence.*;

@Entity
public class FamilyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="familyname")
    private String familyName;
    @Column(name="givenname")
    private String givenName;
    @Column(name="age")
    private Integer age;

    @Column(name="familynumber")
    private Integer familyNumber;


    public FamilyMember() {
    }

    public FamilyMember(String familyName, String givenName, Integer age, Integer familyNumber) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.age = age;
        this.familyNumber = familyNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getFamilyNumber() {
        return familyNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setFamilyNumber(Integer familyNumber) {
        this.familyNumber = familyNumber;
    }
}
