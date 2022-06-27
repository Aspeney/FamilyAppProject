package com.familyapp.familyapp.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamilyMemberRepository extends CrudRepository<FamilyMember, Integer> {
    List<FamilyMember> findByFamilyNumber(Integer familyNumber);
}
