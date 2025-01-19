package az.ingressproduct.dao.controller;

import az.ingressproduct.dao.model.request.CreateProductRequest;
import az.ingressproduct.dao.service.abstraction.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {
        private final ProductService productService;

        @PostMapping("/v1/createProduct")
        @ResponseStatus(HttpStatus.CREATED)
        public void createProduct(@RequestBody CreateProductRequest createProductRequest){
            productService.createProduct(createProductRequest);
        }
}
