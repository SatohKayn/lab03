package nguyenkyan.demo.services;

import nguyenkyan.demo.enity.Category;
import nguyenkyan.demo.enity.book;
import nguyenkyan.demo.repository.IBookRepository;
import nguyenkyan.demo.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }
    public Category getCategoryById(Long id){
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        } else {
            throw new RuntimeException("Category Not Found");
        }
    }

    public Category saveCategory(Category category) { return categoryRepository.save(category);}
    public void deleteCategory(Long id) {categoryRepository.deleteById(id);}
}
