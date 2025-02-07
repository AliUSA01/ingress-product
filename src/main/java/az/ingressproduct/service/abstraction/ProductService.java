package az.ingressproduct.service.abstraction;

import az.ingressproduct.model.request.CreateProductRequest;
import az.ingressproduct.model.response.ProductResponse;

public interface ProductService {

    void createProduct(CreateProductRequest createProductRequest);

    ProductResponse getProductById(Long id);
}







