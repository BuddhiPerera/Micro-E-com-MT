package lk.sliit.mtit.microservice.commerce.customer.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    private String name;
    private String address;
    @Temporal(TemporalType.DATE)
    private Date date;
    private int age;
    private int telephone;


}
