package cesar.sa.spring_practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import cesar.sa.spring_practice.products.Products;
import cesar.sa.spring_practice.products.ProductsRepository;

@Service
public class PracticeService {

    @Autowired
    ProductsRepository repo;

    @ModelAttribute("products")
    public List<Products> getAll() {
        return (List<Products>) repo.findAll();
    }

    public Long count() {
        return repo.count();
    }
    
}
