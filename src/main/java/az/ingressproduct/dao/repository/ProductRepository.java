package az.ingressproduct.dao.repository;

import az.ingressproduct.dao.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity,Long> {

}
