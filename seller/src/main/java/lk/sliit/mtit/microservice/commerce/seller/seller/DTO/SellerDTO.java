package lk.sliit.mtit.microservice.commerce.seller.seller.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO {
    private Long sellerId;
    private String name;
    private int age;
    private String address;
    private Date date;
}
