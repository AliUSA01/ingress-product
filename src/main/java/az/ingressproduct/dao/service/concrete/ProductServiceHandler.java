package az.ingressproduct.dao.service.concrete;

import az.ingressproduct.dao.mapper.ProductMapper;
import az.ingressproduct.dao.model.request.CreateProductRequest;
import az.ingressproduct.dao.repository.ProductRepository;
import az.ingressproduct.dao.service.abstraction.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceHandler implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public void createProduct(CreateProductRequest createProductRequest) {
        productRepository.save(ProductMapper
                .PRODUCT_MAPPER
                    .buildProductEntity(createProductRequest));


    }
}
