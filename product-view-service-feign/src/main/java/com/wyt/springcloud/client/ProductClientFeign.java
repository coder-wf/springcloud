package com.wyt.springcloud.client;
 
import java.util.List;

import com.wyt.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

 
@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {
 
    @GetMapping("/products")
    public List<Product> listProdcuts();
}