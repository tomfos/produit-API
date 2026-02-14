package com.produit.produitAPI.service;

import com.produit.produitAPI.model.Produit;
import com.produit.produitAPI.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitService {

    private final ProduitRepository produitRepository;

    public List<Produit> getAllProduit() {
        return (List<Produit>) produitRepository.findAll();
    }

    public Produit create(Produit produit) {
        return produitRepository.save(produit);
    }
}
