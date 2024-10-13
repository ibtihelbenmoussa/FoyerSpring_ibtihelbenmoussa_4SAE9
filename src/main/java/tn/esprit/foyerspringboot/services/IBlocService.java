package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entities.Bloc;
import tn.esprit.foyerspringboot.entities.Chambre;

import java.util.List;

public interface IBlocService {
    Bloc addBloc (Bloc bloc );
    void deleteBloc (Long idBloc);
    List<Bloc> getAllBloc();
    Bloc updateBloc (Bloc bloc);
}
