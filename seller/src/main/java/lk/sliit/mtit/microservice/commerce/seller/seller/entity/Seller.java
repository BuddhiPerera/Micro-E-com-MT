package lk.sliit.mtit.microservice.commerce.seller.seller.entity;

import lk.sliit.mtit.microservice.commerce.seller.seller.DTO.SellerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sellerId;
    private String name;
    private int age;
    private String address;
    @Temporal(TemporalType.DATE)
    private Date date;

}
