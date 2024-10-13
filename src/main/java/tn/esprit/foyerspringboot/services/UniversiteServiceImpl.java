package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entities.Universite;
import tn.esprit.foyerspringboot.repositories.ReservationRepository;
import tn.esprit.foyerspringboot.repositories.UniversiteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}
