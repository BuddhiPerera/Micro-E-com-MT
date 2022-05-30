package lk.sliit.mtit.microservice.commerce.item.item.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
    private Long sellerId;
    private String name;
    private int age;
    private String address;
    @Temporal(TemporalType.DATE)
    private Date date;
}
