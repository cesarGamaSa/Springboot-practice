package cesar.sa.spring_practice.products;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Long> {
    // necessary to be an interface in order to extend CrudRepository
}
