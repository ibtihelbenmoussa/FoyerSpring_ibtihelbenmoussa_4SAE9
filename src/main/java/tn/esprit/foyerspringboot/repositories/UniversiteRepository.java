package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerspringboot.entities.Reservation;
import tn.esprit.foyerspringboot.entities.Universite;
@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long > {

}
