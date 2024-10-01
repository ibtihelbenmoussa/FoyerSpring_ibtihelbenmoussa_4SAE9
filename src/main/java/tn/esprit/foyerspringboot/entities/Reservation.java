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

public class Reservation {
    @Id
    private String idResrvation;
    private Date anneeUniversitaire;
    private Boolean estValide;

    @ManyToMany
    private Set<Etudiant> etudiants;

}
