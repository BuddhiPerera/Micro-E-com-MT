package lk.sliit.mtit.ecommerce.supplier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long supplierId;
    private String supplierName;
    private int supplierAge;
    private String supplierAddress;
    private String supplierContactNo;
}
