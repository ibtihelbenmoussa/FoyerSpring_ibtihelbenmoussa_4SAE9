package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entities.Chambre;

import java.util.List;

public interface IChambreService  {
    Chambre addChambre (Chambre chambre);
    void deleteChambre (Long idChamre);
    List <Chambre> getAllChambre ();
    Chambre updateChambre (Chambre chambre);
}
