package one.digitalinnovation.productcatalog.repository;


import one.digitalinnovation.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchCrudRepository<Product, Integer> {
    List<Product> findByName(String name);
}
