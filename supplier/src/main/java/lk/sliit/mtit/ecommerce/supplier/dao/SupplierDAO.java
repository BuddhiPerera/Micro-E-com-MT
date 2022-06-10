package lk.sliit.mtit.ecommerce.supplier.dao;

import lk.sliit.mtit.ecommerce.supplier.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDAO extends JpaRepository<Supplier, Long> {

    Supplier getSupplierBySupplierId(Long supplierId);

    void deleteSupplierBySupplierId(Long supplierId);
}
