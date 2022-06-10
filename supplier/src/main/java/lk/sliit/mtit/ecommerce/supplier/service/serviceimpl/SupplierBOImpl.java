package lk.sliit.mtit.ecommerce.supplier.service.serviceimpl;

import lk.sliit.mtit.ecommerce.supplier.dao.SupplierDAO;
import lk.sliit.mtit.ecommerce.supplier.dto.SupplierDTO;
import lk.sliit.mtit.ecommerce.supplier.entity.Supplier;
import lk.sliit.mtit.ecommerce.supplier.service.SupplierBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
@Slf4j
public class SupplierBOImpl implements SupplierBO {
    @Autowired
    private SupplierDAO supplierDAO;

    @Override
    public SupplierDTO saveSupplier(SupplierDTO supplierDTO) {
        supplierDAO.save(new Supplier(
                supplierDTO.getSupplierId(),
                supplierDTO.getSupplierName(),
                supplierDTO.getSupplierAge(),
                supplierDTO.getSupplierAddress(),
                supplierDTO.getSupplierContactNo()
        ));
        log.info("Save Supplier");
        return supplierDTO;
    }

    @Override
    public SupplierDTO getSupplier(Long supplierId) {
        Supplier supplier = supplierDAO.getSupplierBySupplierId(supplierId);
        return new SupplierDTO(
                supplier.getSupplierId(),
                supplier.getSupplierName(),
                supplier.getSupplierAge(),
                supplier.getSupplierAddress(),
                supplier.getSupplierContactNo()
        );
    }

    @Override
    public void deleteSupplier(Long supplierId) {
        try{
            supplierDAO.deleteSupplierBySupplierId(supplierId);
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }

    @Override
    public void updateSupplier(SupplierDTO supplierDTO) {
        supplierDAO.save(new Supplier(
                supplierDTO.getSupplierId(),
                supplierDTO.getSupplierName(),
                supplierDTO.getSupplierAge(),
                supplierDTO.getSupplierAddress(),
                supplierDTO.getSupplierContactNo()
        ));
        log.info("Update Supplier");
    }

    @Transactional(readOnly = true)
    @Override
    public List<SupplierDTO> getAllSuppliers() {
        List<Supplier> suppliers = supplierDAO.findAll();
        List<SupplierDTO> supplierDTOS = new ArrayList<>();
        for (Supplier supplier: suppliers
             ) {
            supplierDTOS.add(new SupplierDTO(
                    supplier.getSupplierId(),
                    supplier.getSupplierName(),
                    supplier.getSupplierAge(),
                    supplier.getSupplierAddress(),
                    supplier.getSupplierContactNo()
            ));
        }
        return supplierDTOS;
    }
}
