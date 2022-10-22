package co.usa.ciclo3.ciclo3.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import co.usa.ciclo3.ciclo3.model.Cabin;
import co.usa.ciclo3.ciclo3.repository.crud.CabinCrudRepository;
import java.util.Optional;

@Repository
public class CabinRepository {
    
    @Autowired
    private CabinCrudRepository cabinCrudRepository;
    
    public List <Cabin> getAll(){
        return (List<Cabin>) cabinCrudRepository.findAll();
    }

    public Optional <Cabin> getCabin(int id){
        return cabinCrudRepository.findById(id);
    } 

    public Cabin save(Cabin c){
        return cabinCrudRepository.save(c);
    }
}
