package lk.sliit.mtit.ecommerce.supplier.controller;

import lk.sliit.mtit.ecommerce.supplier.dto.SupplierDTO;
import lk.sliit.mtit.ecommerce.supplier.service.SupplierBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierBO supplierBO;

    @PostMapping("/saveSupplier")
    public SupplierDTO saveSupplier(@RequestBody SupplierDTO supplierDTO){
        return supplierBO.saveSupplier(supplierDTO);
    }

    @GetMapping("/{supplierId}")
    public SupplierDTO getSupplier(@PathVariable("supplierId") Long supplierId){
        return supplierBO.getSupplier(supplierId);
    }

    @DeleteMapping("/{supplierId}")
    public void deleteSupplier(@PathVariable("supplierId") Long supplierId){
        supplierBO.deleteSupplier(supplierId);
    }

    @PutMapping("/{supplierId}")
    public void updateSupplier(@PathVariable Long supplierId,
                           @RequestBody SupplierDTO supplierDTO){
        supplierDTO.setSupplierId(supplierId);
        supplierBO.updateSupplier(supplierDTO);
    }

    @GetMapping("/getAll")
    public List<SupplierDTO> getAllSuppliers(){
        return supplierBO.getAllSuppliers();
    }
}
