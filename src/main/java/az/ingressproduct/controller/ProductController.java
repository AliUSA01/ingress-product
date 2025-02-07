package az.ingressproduct.controller;

import az.ingressproduct.model.request.CreateProductRequest;
import az.ingressproduct.model.response.ProductResponse;
import az.ingressproduct.service.abstraction.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {
        private final ProductService productService;

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public void createProduct(@RequestBody @Valid CreateProductRequest createProductRequest){
            productService.createProduct(createProductRequest);
        }

        @GetMapping("/{id}")
        public ProductResponse getProduct(@PathVariable Long id)          {
                return productService.getProductById(id);
        }
}
