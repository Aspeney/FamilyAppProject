package com.familyapp.familyapp;


import com.familyapp.familyapp.service.FamilyApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class FamilyController {

    @Autowired
    private FamilyApp familyApp;

    @PostMapping("/family")
    public int createNewFamily( @RequestBody FamilyRequest family) {

        int familyNumber = familyApp.createFamily(family);
        return familyNumber;
    }

    @GetMapping("/family/{familyNumber}")
    public FamilyResponse getFamily(@PathVariable int familyNumber) {
        FamilyResponse family = familyApp.getFamily(familyNumber);
        return family;

    }




}


