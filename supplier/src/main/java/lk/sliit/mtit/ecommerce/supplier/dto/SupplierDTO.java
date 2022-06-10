package lk.sliit.mtit.ecommerce.supplier.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO {
    private Long supplierId;
    private String supplierName;
    private int supplierAge;
    private String supplierAddress;
    private String supplierContactNo;
}
