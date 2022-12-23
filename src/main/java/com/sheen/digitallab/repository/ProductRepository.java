package com.sheen.digitallab.repository;

import com.sheen.digitallab.entity.Category;
import com.sheen.digitallab.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.lang.model.element.Name;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

  public List<Product> findByCategory(Category category);

  public List<Product> findByName(String name);

  public List<Product> findByDescription(String description);

  public List<Product> findByStock(Double stock);

  public List<Product> findByPrice(Double price);

  public List<Product> findByStatus(String status);

}
