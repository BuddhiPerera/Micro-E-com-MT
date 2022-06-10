package lk.sliit.mtit.ecommerce.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    private String orderName;
    private String orderAddress;
    private String orderState;
    private String orderCountry;
    private String zipCode;
    private String contactNo;
    private int orderQty;
    @Temporal(TemporalType.DATE)
    private Date orderDate;
}
