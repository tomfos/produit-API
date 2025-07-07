package com.stockDe.produit.exceptions;


import com.stockDe.produit.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProduitExceptionHandler {

    @ExceptionHandler(ProduitNotFound.class)
    public ResponseEntity<ErrorResponse> handleProduitNotFoundException(ProduitNotFound pex) {

        ErrorResponse response = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                pex.getMessage()
        );

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
