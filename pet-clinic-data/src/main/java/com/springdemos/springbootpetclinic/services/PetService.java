package com.springdemos.springbootpetclinic.services;

import com.springdemos.springbootpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById();
    Pet save(Pet pet);
    Set<Pet> findAll();
}
