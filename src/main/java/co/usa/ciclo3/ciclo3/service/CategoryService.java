package co.usa.ciclo3.ciclo3.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.usa.ciclo3.ciclo3.model.Category;
import co.usa.ciclo3.ciclo3.repository.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }

    public Optional <Category> getCategory(int id){
        return categoryRepository.getCategory(id);
    }

    public Category save(Category x){
        if(x.getId()==null){
            return categoryRepository.save(x);
        }else{
            Optional<Category> xaux=categoryRepository.getCategory(x.getId());
            if(xaux.isPresent()){
                return categoryRepository.save(x);
            }else{
                return x;
            }
        }
    }
}

