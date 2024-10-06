package tn.esprit.foyerspringboot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id

private long idBloc ;
    private String nomBloc ;
    private long capaciteBloc ;

    @ManyToOne
    private Foyer F;
    @OneToMany
    private List<Chambre> C ;
}
