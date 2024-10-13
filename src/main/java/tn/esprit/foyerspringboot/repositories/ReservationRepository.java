package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerspringboot.entities.Foyer;
import tn.esprit.foyerspringboot.entities.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long > {
}
