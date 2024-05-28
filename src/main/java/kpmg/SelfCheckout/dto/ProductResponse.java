package kpmg.SelfCheckout.dto;

import kpmg.SelfCheckout.model.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponse {
    private Product product;
    private Double[] sellingPriceArray;
}
