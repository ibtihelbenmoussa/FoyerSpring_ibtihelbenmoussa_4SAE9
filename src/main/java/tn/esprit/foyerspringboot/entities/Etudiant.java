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
        private Long idEtudiant;
        private String nomE;
        private String prenomE;
        private  Long cin;
        private  String ecole;
        private Date dateNaissance;


        @ManyToMany(mappedBy = "etudiants")
private Set<Reservation> reservations;
}
