package com.wyt.springcloud.client;
 
import java.util.List;

import com.wyt.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
 
@Component
public class ProductClientRibbon {
 
    @Autowired
    RestTemplate restTemplate;
 
    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
 
}