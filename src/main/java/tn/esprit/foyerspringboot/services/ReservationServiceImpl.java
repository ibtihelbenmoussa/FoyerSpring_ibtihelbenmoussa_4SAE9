package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.entities.Reservation;
import tn.esprit.foyerspringboot.repositories.ChambreRepository;
import tn.esprit.foyerspringboot.repositories.ReservationRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{
    ReservationRepository reservationRepository ;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long idReservation) {
     reservationRepository.deleteById(idReservation);

    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
