package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerspringboot.entities.Bloc;
import tn.esprit.foyerspringboot.entities.Foyer;
@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long > {
}
