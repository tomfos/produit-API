package com.stockDe.produit.exceptions;

public class ProduitNotFound extends RuntimeException{

    public ProduitNotFound(String message) {
        super(message);
    }
}
