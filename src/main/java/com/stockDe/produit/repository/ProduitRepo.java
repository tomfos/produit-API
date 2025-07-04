package com.stockDe.produit.repository;

import com.stockDe.produit.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepo extends JpaRepository<Produit, Long> {
}
