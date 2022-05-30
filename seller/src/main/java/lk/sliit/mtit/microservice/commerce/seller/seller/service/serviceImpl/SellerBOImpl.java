package lk.sliit.mtit.microservice.commerce.seller.seller.service.serviceImpl;

import lk.sliit.mtit.microservice.commerce.seller.seller.DTO.SellerDTO;
import lk.sliit.mtit.microservice.commerce.seller.seller.entity.Seller;
import lk.sliit.mtit.microservice.commerce.seller.seller.repository.SellerDAO;
import lk.sliit.mtit.microservice.commerce.seller.seller.service.SellerBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SellerBOImpl implements SellerBO {

    @Autowired
    private SellerDAO sellerDAO;

    @Override
    public SellerDTO saveSeller(SellerDTO seller) {
        log.info("Inside Seller Bo Impl");
        sellerDAO.save(new Seller(
                seller.getSellerId(),
                seller.getName(),
                seller.getAge(),
                seller.getAddress(),
                seller.getDate()));
        return seller;
    }

    @Override
    public SellerDTO getSeller(Long sellerId) {
        Seller seller = sellerDAO.getBySellerId(sellerId);
        return new SellerDTO(seller.getSellerId(),
                seller.getName(),
                seller.getAge(),
                seller.getAddress(),
                seller.getDate());
    }
}
