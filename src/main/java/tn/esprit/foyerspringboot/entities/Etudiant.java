package tn.esprit.foyerspringboot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant ;
    private String nomEt;
    private String prenomEt;
    private long cin ;
    private String ecole ;
    private Date dateNaissance ;
    @ManyToMany(mappedBy = "etudiants")
    private Set<Reservation> reservations;

}
