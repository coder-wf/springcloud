package com.wyt.springcloud.service;
 
import java.util.List;

import com.wyt.springcloud.client.ProductClientRibbon;
import com.wyt.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();
    }
}