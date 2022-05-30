package lk.sliit.mtit.microservice.commerce.seller.seller.service;

import lk.sliit.mtit.microservice.commerce.seller.seller.DTO.SellerDTO;
import lk.sliit.mtit.microservice.commerce.seller.seller.entity.Seller;

public interface SellerBO {
    SellerDTO saveSeller(SellerDTO seller);

    SellerDTO getSeller(Long sellerId);
}
