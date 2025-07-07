package com.stockDe.produit.repository;

import com.stockDe.produit.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepo extends JpaRepository<Person, Long> {
}
