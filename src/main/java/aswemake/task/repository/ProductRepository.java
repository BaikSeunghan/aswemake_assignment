package aswemake.task.repository;

import aswemake.task.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
  Product findByName(String name);
}
