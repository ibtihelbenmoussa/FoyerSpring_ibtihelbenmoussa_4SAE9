package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerspringboot.entities.Chambre;
@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {


}
