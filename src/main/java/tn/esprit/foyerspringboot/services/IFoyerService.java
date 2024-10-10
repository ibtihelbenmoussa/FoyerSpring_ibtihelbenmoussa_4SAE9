package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entities.Bloc;
import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer (Foyer foyer );
    void deleteFoyer (Long idFoyer);
    List<Foyer> getAllFoyer();
    Foyer updateFoyer (Foyer foyer );
}
