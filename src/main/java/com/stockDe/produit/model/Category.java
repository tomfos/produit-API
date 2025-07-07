package com.stockDe.produit.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue
    private Long category_id;
    private String name;

    @ManyToMany(mappedBy = "categoryList")
    @JoinTable(
            name = "produit_category",
            joinColumns = @JoinColumn(name = "idProduit"),
            inverseJoinColumns = @JoinColumn(name = "idCategory")
    )
    private List<Produit> produitList;
}
