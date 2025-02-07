package az.ingressproduct.mapper;



import az.ingressproduct.entity.ProductEntity;
import az.ingressproduct.model.request.CreateProductRequest;
import az.ingressproduct.model.response.ProductResponse;

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

        public ProductResponse buildProductResponse(ProductEntity productEntity){
            return ProductResponse.builder()
                    .id(productEntity.getId())
                    .name(productEntity.getName())
                    .description(productEntity.getDescription())
                    .price(productEntity.getPrice())
                    .quantity(productEntity.getQuantity()       )
                    .build();
        }
}
