package co.usa.ciclo3.ciclo3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.usa.ciclo3.ciclo3.model.Cabin;
import co.usa.ciclo3.ciclo3.repository.CabinRepository;
import java.util.List;
import java.util.Optional;


@Service
public class CabinService {
    
    @Autowired
    private CabinRepository cabinRepository;

    public List<Cabin> getAll(){
        return cabinRepository.getAll();
    }

    public Optional <Cabin> getCabin(int id){
        return cabinRepository.getCabin(id);
    }

    public Cabin save(Cabin c){
        if(c.getId()==null){
            return cabinRepository.save(c);
        }else{
            Optional<Cabin> paux=cabinRepository.getCabin(c.getId());
            if(paux.isEmpty()){
                return cabinRepository.save(c);
            }else{
                return c;
            }
        }
    }
}

