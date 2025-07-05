package com.stockDe.produit.controller;

import com.stockDe.produit.model.Produit;
import com.stockDe.produit.service.ProduitService;
//import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produits")
//@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/tousLesProduits")
    public List<Produit> getAllProduit() {
        return produitService.getAllProduit();
    }

    @PostMapping("/créerProduit")
    public Produit createProduit(@RequestBody Produit produit) {
        return produitService.createProduit(produit);
    }

    @GetMapping("{id}")
    public Produit getProduitById(@PathVariable long id) {
        return produitService.getProduitById(id);
    }

    @DeleteMapping("/supprimer/{id}")
    public String deleteProduitById(@PathVariable long id) {
        return produitService.deleteProduitById(id);
    }

    @PutMapping("{id}")
    public Produit modifierProduit(@PathVariable long id, @RequestBody Produit produit) {
        return produitService.modificationDuProdiut(id, produit);
    }

}