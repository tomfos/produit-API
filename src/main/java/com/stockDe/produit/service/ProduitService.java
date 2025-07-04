package com.stockDe.produit.service;

import com.stockDe.produit.model.Produit;
import com.stockDe.produit.repository.ProduitRepo;
//import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class ProduitService {

    private final ProduitRepo produitRepo;

    public ProduitService(ProduitRepo produitRepo) {
        this.produitRepo = produitRepo;
    }

    public List<Produit> getAllProduit() {
        return produitRepo.findAll();
    }

    public Produit createProduit(Produit produit) {
        return produitRepo.save(produit);
    }
}
