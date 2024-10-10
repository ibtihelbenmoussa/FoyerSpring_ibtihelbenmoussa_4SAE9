package tn.esprit.foyerspringboot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.entities.Foyer;
import tn.esprit.foyerspringboot.services.IChambreService;
import tn.esprit.foyerspringboot.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {
    IFoyerService foyerService;

    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer f){
        return foyerService.addFoyer(f);
    }

    @GetMapping("/findAll")
    List<Foyer> findAll(){
        return foyerService.getAllFoyer();
    }

    @PutMapping("/updateFoyer")
    Foyer updateFoyer(@RequestBody Foyer f){
        return foyerService.updateFoyer(f);
    }

    @DeleteMapping("/deleteFoyer/{id}")
    void deleteFoyer(@PathVariable Long id){
        foyerService.deleteFoyer(id);
    }
}