package tn.esprit.foyerspringboot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.entities.Etudiant;
import tn.esprit.foyerspringboot.services.IChambreService;
import tn.esprit.foyerspringboot.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {
    IEtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
    }

    @GetMapping("/findAll")
    List<Etudiant> findAll(){
        return etudiantService.getAllEtudiant();
    }

    @PutMapping("/updateEtudiant")
   Etudiant updateEtudiant(@RequestBody Etudiant e){
        return etudiantService.updateEtudiant(e);
    }

    @DeleteMapping("/deleteEtudiant/{id}")
    void deleteEtudiant(@PathVariable Long id){
        etudiantService.deleteEtudiant(id);
    }
}