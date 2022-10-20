package co.usa.ciclo3.ciclo3.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String messagetext;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMessagetext() {
        return messagetext;
    }
    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }
}

