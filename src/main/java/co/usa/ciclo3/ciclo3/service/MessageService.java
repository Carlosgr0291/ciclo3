package co.usa.ciclo3.ciclo3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.ciclo3.ciclo3.model.Message;
import co.usa.ciclo3.ciclo3.repository.MessageRepository;

@Service
public class MessageService {
    
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.getAll();
    }

    public Optional<Message> getMessage(int id){
        return messageRepository.getMessage(id);
    }

    public Message save(Message c){
        if(c.getId()==null){
            return messageRepository.save(c);
        }else{
            Optional<Message> paux=messageRepository.getMessage(c.getIdMessage());
            if(paux.isEmpty()){
                return messageRepository.save(c);
            }else{
                return c;
            }
        }
    }
}

