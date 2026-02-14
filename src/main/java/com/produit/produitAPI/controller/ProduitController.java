package com.produit.produitAPI.controller;

import com.produit.produitAPI.model.Produit;
import com.produit.produitAPI.service.ProduitService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produits")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @GetMapping("/hello")
    public String hello() {return "Hello World";}

    @GetMapping("/all")
    @Operation(summary = "Récupérer tous les produits")
    public List<Produit> getAll() {
        return produitService.getAllProduit();
    }

    @PostMapping
    @Operation(summary = "Créer un nouveau produit")
    public Produit save(@RequestBody Produit produit) {
        return produitService.create(produit);
    }

    @GetMapping("{id}")
    @Operation(summary = "Récupérer un produit")
    public Produit getOne(@PathVariable Long id) {
        return produitService.getProduitById(id);
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Supprimer un produit")
    public String deleteOne(@PathVariable Long id) {
        return produitService.deleteProduitById(id);
    }

    @PutMapping("{id}")
    @Operation(summary = "Modifier un produit")
    public Produit editProduit(@PathVariable Long id, @RequestBody  Produit produit) {
        return produitService.modifierProduit(id, produit);
    }
}
