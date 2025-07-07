package com.stockDe.produit.service;

import com.stockDe.produit.repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepo personRepo;
}
