package lk.sliit.mtit.microservice.commerce.seller.seller.controller;


import lk.sliit.mtit.microservice.commerce.seller.seller.DTO.SellerDTO;
import lk.sliit.mtit.microservice.commerce.seller.seller.service.SellerBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sellers")
@Slf4j
public class SellerController {

    @Autowired
    private SellerBO sellerBO;

    @PostMapping("/saveSeller")
    public SellerDTO saveSeller(@RequestBody SellerDTO seller) {
        log.info("Seller Save Controller");
        return sellerBO.saveSeller(seller);
    }
    @GetMapping("/{id}")
    public SellerDTO getSeller(@PathVariable ("id") Long sellerId) {
        log.info("Seller get Controller");
        return sellerBO.getSeller(sellerId);
    }
}
