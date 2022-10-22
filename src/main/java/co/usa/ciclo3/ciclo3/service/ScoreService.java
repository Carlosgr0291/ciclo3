package co.usa.ciclo3.ciclo3.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.usa.ciclo3.ciclo3.model.Score;
import co.usa.ciclo3.ciclo3.repository.ScoreRepository;

@Service
public class ScoreService {
    
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAll(){
        return scoreRepository.getAll();
    }

    public Optional <Score> get(int id){
        return scoreRepository.getScore(id);
    }

    public Score save(Score c){
        if(c.getIdScore()==null){
            return scoreRepository.save(c);
        }else{
            Optional<Score> paux=scoreRepository.getScore(c.getIdScore());
            if(paux.isEmpty()){
                return scoreRepository.save(c);
            }else{
                return c;
            }
        }
    }
}


