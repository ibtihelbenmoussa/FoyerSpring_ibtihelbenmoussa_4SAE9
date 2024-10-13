package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entities.Bloc;
import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.repositories.BlocRepository;
import tn.esprit.foyerspringboot.repositories.ChambreRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{
    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
