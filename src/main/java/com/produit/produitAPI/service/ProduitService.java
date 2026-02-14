package com.produit.produitAPI.service;

import com.produit.produitAPI.model.Produit;
import com.produit.produitAPI.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Produit getProduitById(Long id) {
        Optional<Produit> produit = produitRepository.findById(id);

        if(produit.isEmpty()){
            throw new RuntimeException("Produit n'existe pas");
        }
        return produit.get();
    }

    public String deleteProduitById(Long id) {
        Optional<Produit> produit = produitRepository.findById(id);
        if(produit.isEmpty()){
            throw new RuntimeException("Suppréssion impossible, produit n'existe pas");
        }
        produitRepository.delete(produit.get());
        return "Produit supprimé avec succès";
    }

    public Produit modifierProduit(Long id, Produit produit) {
        Optional<Produit> produit1 = produitRepository.findById(id);
        if(produit1.isEmpty()){
            throw new RuntimeException("Produit n'existe pas");
        }
        Produit newProduit =  produit1.get();
        newProduit.setName(produit.getName());
        newProduit.setPrice(produit.getPrice());

        return produitRepository.save(newProduit);
    }
}
