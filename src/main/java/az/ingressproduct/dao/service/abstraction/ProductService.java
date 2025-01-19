package az.ingressproduct.dao.service.abstraction;

import az.ingressproduct.dao.model.request.CreateProductRequest;
import az.ingressproduct.dao.service.concrete.ProductServiceHandler;
import org.springframework.objenesis.SpringObjenesis;

public interface ProductService {

    void createProduct(CreateProductRequest createProductRequest);
    }

