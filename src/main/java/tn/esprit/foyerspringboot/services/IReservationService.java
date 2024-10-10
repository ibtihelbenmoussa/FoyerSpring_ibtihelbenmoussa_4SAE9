package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.entities.Foyer;
import tn.esprit.foyerspringboot.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation (Reservation reservation);
    void deleteReservation (Long idReservation);
    List<Reservation> getAllReservation();
    Reservation updateReservation (Reservation reservation );
}
