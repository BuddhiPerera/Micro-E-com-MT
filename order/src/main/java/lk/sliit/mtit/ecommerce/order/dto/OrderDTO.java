package lk.sliit.mtit.ecommerce.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long orderId;
    private String orderName;
    private String orderAddress;
    private String orderState;
    private String orderCountry;
    private String zipCode;
    private String contactNo;
    private int orderQty;
    private Date orderDate;
}
