package kpmg.SelfCheckout.dto;

import lombok.Data;
import kpmg.SelfCheckout.model.OrderItem;

import java.util.List;

@Data
public class ReceiptRequest {
    List<OrderItem> orderItemsList;
    Double tax;
    Double grandTotal;
}
