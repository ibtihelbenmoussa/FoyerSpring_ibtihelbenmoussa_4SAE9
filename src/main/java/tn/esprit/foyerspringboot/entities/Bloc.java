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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private  String nomBloc;
    private  Long capaciteBloc;
    @ManyToOne
    private Foyer foyer;
    @OneToMany
    private List<Chambre> chambreList;



}
