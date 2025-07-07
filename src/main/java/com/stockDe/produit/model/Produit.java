package com.stockDe.produit.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "produit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

    @Id
    @GeneratedValue
    private Long produit_id;

    private String name;
    private double price;

    @ManyToMany
    private List<Category> categoryList;
}
