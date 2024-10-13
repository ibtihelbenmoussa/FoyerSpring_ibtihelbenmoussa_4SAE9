package tn.esprit.foyerspringboot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.entities.Reservation;
import tn.esprit.foyerspringboot.entities.Universite;
import tn.esprit.foyerspringboot.services.IReservationService;
import tn.esprit.foyerspringboot.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteServicee;

    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite u){
        return universiteServicee.addUniversite(u);
    }

    @GetMapping("/findAll")
    List<Universite> findAll(){
        return universiteServicee.getAllUniversite();
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite u){
        return universiteServicee.updateUniversite(u);
    }

    @DeleteMapping("/deleteUniversite/{id}")
    void deleteUniversite(@PathVariable Long id){
        universiteServicee.deleteUniversite(id);
    }
}