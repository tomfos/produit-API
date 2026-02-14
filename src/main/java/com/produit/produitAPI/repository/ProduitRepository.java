package com.produit.produitAPI.repository;

import com.produit.produitAPI.model.Produit;
import org.springframework.data.repository.CrudRepository;

public interface ProduitRepository extends CrudRepository<Produit, Long> {
}
