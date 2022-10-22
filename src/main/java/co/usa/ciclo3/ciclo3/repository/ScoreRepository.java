package co.usa.ciclo3.ciclo3.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import co.usa.ciclo3.ciclo3.model.Score;
import co.usa.ciclo3.ciclo3.repository.crud.ScoreCrudRepository;

import java.util.Optional;

@Repository
public class ScoreRepository {
    
    @Autowired
    private static ScoreCrudRepository scoreCrudRepository;
    
    public List <Score> getAll(){
        return (List<Score>) scoreCrudRepository.findAll();
    }

    public Optional <Score> getScore(int id){
        return scoreCrudRepository.findById(id);
    } 

    public Score save(Score s){
        return scoreCrudRepository.save(s);
    }
}