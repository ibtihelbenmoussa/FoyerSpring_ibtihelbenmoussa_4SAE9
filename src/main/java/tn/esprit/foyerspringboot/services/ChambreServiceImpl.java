package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.repositories.ChambreRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImpl  implements IChambreService{
    ChambreRepository chambreRepository ;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChamre) {
        chambreRepository.deleteById(idChamre);

    }

    @Override
    public List<Chambre> getAllChambre() {

        return chambreRepository.findAll();
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {

        return chambreRepository.save(chambre);
    }
}
