package az.ingressproduct.service.concrete;

import az.ingressproduct.model.enums.ErrorMessage;
import az.ingressproduct.model.request.CreateProductRequest;
import az.ingressproduct.model.response.ProductResponse;
import az.ingressproduct.exception.NotFoundException;
import az.ingressproduct.repository.ProductRepository;
import az.ingressproduct.service.abstraction.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static az.ingressproduct.mapper.ProductMapper.PRODUCT_MAPPER;


@Service
@RequiredArgsConstructor
public class ProductServiceHandler implements ProductService {
    private final ProductRepository productRepository;


    @Override
    public void createProduct(CreateProductRequest createProductRequest) {
        productRepository.save(PRODUCT_MAPPER
                .buildProductEntity(createProductRequest));


    }

    @Override
    public ProductResponse getProductById(Long id) {
        return productRepository.findById(id)
                .map(PRODUCT_MAPPER::buildProductResponse)
                .orElseThrow(() ->
                        new NotFoundException(String.format(
                                ErrorMessage.PRODUCT_NOT_FOUND.getMessage(),
                                id
                        ))
                );
    }


}

