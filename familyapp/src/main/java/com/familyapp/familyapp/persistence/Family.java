package com.familyapp.familyapp.persistence;

import javax.persistence.*;

@Entity
@Table(name="familyapp")
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="familyname")
    private String familyName;

    @Column(name="nrOfInfants")
    private Integer nrOfInfants;
    @Column(name="nrOfChildren")
    private Integer nrOfChildren;
    @Column(name="nrOfAdults")
    private Integer nrOfAdults;

    @Column(name="familynumber")
    private Integer familyNumber;

    public Family() {
    }

    public Family(String familyName, Integer nrOfInfants, Integer nrOfChildren, Integer nrOfAdults, Integer familyNumber) {
        this.familyName = familyName;
        this.nrOfInfants = nrOfInfants;
        this.nrOfChildren = nrOfChildren;
        this.nrOfAdults = nrOfAdults;
        this.familyNumber = familyNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Integer getNrOfInfants() {
        return nrOfInfants;
    }

    public Integer getNrOfChildren() {
        return nrOfChildren;
    }

    public Integer getNrOfAdults() {
        return nrOfAdults;
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

    public void setNrOfInfants(Integer nrOfInfants) {
        this.nrOfInfants = nrOfInfants;
    }

    public void setNrOfChildren(Integer nrOfChildren) {
        this.nrOfChildren = nrOfChildren;
    }

    public void setNrOfAdults(Integer nrOfAdults) {
        this.nrOfAdults = nrOfAdults;
    }

    public void setFamilyNumber(Integer familyNumber) {
        this.familyNumber = familyNumber;
    }
}
