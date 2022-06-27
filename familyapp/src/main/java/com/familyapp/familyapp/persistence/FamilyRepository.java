package com.familyapp.familyapp.persistence;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends CrudRepository<Family, Integer> {
    Family findByFamilyNumber(Integer familyNumber);
}
