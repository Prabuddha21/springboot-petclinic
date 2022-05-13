package com.springdemos.springbootpetclinic.services;

import com.springdemos.springbootpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
