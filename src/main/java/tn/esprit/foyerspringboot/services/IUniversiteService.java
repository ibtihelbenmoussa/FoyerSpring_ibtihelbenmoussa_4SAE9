package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.entities.Reservation;
import tn.esprit.foyerspringboot.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite (Universite universite);
    void deleteUniversite (Long idUniversite);
    List<Universite> getAllUniversite();
    Universite updateUniversite(Universite universite );
}
