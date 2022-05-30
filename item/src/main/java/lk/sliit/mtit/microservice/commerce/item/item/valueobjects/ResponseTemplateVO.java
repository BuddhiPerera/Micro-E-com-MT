package lk.sliit.mtit.microservice.commerce.item.item.valueobjects;

import lk.sliit.mtit.microservice.commerce.item.item.entity.Items;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Items items;
    private Seller seller;
}
