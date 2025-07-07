package com.stockDe.produit.repository;

import com.stockDe.produit.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
