package lk.sliit.mtit.ecommerce.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data // getters / setters & toString methods
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private String itemName;
    private double itemPrice;
    private int itemQty;
    @Temporal(TemporalType.DATE) // to save Only Date
    private Date date;
    private Long sellerId;
}
