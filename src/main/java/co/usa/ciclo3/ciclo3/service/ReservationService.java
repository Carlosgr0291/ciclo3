package co.usa.ciclo3.ciclo3.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.usa.ciclo3.ciclo3.model.Reservation;
import co.usa.ciclo3.ciclo3.repository.ReservationRepository;

@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAll(){
        return reservationRepository.getAll();
    }

    public Optional <Reservation> get(int id){
        return reservationRepository.getReservation(id);
    }

    public Reservation save(Reservation c){
        if(c.getId()==null){
            return reservationRepository.save(c);
        }else{
            Optional<Reservation> paux=reservationRepository.getReservation(c.getIdReservation());
            if(paux.isEmpty()){
                return reservationRepository.save(c);
            }else{
                return c;
            }
        }
    }
}


