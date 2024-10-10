package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
   Etudiant addEtudiant (Etudiant etudiant);
    void deleteEtudiant(Long idEtudiant);
    List<Etudiant> getAllEtudiant ();
    Etudiant updateEtudiant (Etudiant etudiant);
}
