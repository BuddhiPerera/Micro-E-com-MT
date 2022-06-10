package lk.sliit.mtit.ecommerce.supplier.service;

import lk.sliit.mtit.ecommerce.supplier.dto.SupplierDTO;

import java.util.List;

public interface SupplierBO {
    SupplierDTO saveSupplier(SupplierDTO supplierDTO);

    SupplierDTO getSupplier(Long supplierId);

    void deleteSupplier(Long supplierId);

    void updateSupplier(SupplierDTO supplierDTO);

    List<SupplierDTO> getAllSuppliers();
}
