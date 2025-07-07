package com.stockDe.produit.model;


import com.stockDe.produit.service.PersonService;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue
    private Long address_id;

    private String street;
    private String city;
    private String state;

    @ManyToOne
    @JoinColumn(name = "id")
    private Person person;
}
