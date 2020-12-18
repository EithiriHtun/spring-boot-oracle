package springOracle.springframework.repositories;

import springOracle.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findOne(Long id);

    void delete(Long id);
}
