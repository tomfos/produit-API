package com.produit.produitAPI.controller;

import com.produit.produitAPI.model.Produit;
import com.produit.produitAPI.service.ProduitService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
