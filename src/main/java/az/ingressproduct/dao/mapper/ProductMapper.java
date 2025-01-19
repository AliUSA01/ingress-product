package az.ingressproduct.dao.mapper;

import az.ingressproduct.dao.entity.ProductEntity;
import az.ingressproduct.dao.model.request.CreateProductRequest;

public enum ProductMapper {
    PRODUCT_MAPPER;

    public ProductEntity buildProductEntity (CreateProductRequest createProductRequest){
        return ProductEntity.builder()
                .name(createProductRequest.getName())
                .description(createProductRequest.getDescription())
                .price(createProductRequest.getPrice())
                .quantity(createProductRequest.getQuantity())
                .build();
    }
}
