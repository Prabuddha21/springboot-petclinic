package com.springdemos.springbootpetclinic.services;

import com.springdemos.springbootpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById();
    Owner save(Owner owner);
    Owner findByLastName(String lastname);
    Set<Owner> findAll();
}
