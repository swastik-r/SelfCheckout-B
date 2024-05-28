package kpmg.SelfCheckout.model;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @Column(name = "PRODUCT_SERIAL")
    private String productSerial;

    @Column(name = "SKU_ID")
    private Long skuId;

    @Column(name = "PRODUCT_BRAND")
    private String productBrand;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_IMAGE")
    private String productImage;

    @Column(name = "PRODUCT_CATEGORY")
    private String productCategory;

    @Column(name = "TAX_RATE")
    private Double taxRate;

    @Column(name = "MRP")
    private Double mrp;

    @Column(name = "SELLING_PRICE")
    private Double sellingPrice;
}
