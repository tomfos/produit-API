package com.stockDe.produit.repository;

import com.stockDe.produit.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
