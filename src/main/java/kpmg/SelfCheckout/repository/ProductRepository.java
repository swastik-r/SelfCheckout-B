package kpmg.SelfCheckout.repository;

import kpmg.SelfCheckout.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findBySkuId(Long skuId);
    Product findByProductSerial(String productSerial);
    List<Product> findByProductBrandContaining(String brandName);
    List<Product> findByProductNameContaining(String productName);
    List<Product> findByProductSerialContaining(String id);
}
