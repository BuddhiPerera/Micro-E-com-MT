package lk.sliit.mtit.ecommerce.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;
    private Long userId;
    private Long itemId;
    private Long qty;
    @Temporal(TemporalType.DATE)
    private Date date;
}
