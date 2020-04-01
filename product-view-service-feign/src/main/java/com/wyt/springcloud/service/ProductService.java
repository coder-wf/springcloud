package com.wyt.springcloud.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.wyt.springcloud.client.ProductClientFeign;
import com.wyt.springcloud.pojo.Product;
 
@Service
public class ProductService {
    @Autowired ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();
 
    }
}