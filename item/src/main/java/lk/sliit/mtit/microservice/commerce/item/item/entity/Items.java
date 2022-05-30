package lk.sliit.mtit.microservice.commerce.item.item.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private String name;
    private double price;
    private int qty;
    @Temporal(TemporalType.DATE)
    private Date date;
    private Long sellerId;
}
