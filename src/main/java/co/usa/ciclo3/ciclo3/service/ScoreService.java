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

    public Optional <Score> getScore(int id){
        return scoreRepository.getScore(id);
    }

    public Score save(Score s){
        if(s.getIdScore()==null){
            return scoreRepository.save(s);
        }else{
            Optional<Score> saux=scoreRepository.getScore(s.getIdScore());
            if(saux.isPresent()){
                return scoreRepository.save(s);
            }else{
                return s;
            }
        }
    }
}


