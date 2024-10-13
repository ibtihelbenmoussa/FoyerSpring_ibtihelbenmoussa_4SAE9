package tn.esprit.foyerspringboot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.entities.Bloc;
import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.services.IBlocService;
import tn.esprit.foyerspringboot.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocController {
    IBlocService blocService;

    @PostMapping("/addbloc")
    Bloc addBloc(@RequestBody Bloc b){
        return blocService.addBloc(b);
    }

    @GetMapping("/findAll")
    List<Bloc> findAll(){
        return blocService.getAllBloc();
    }

    @PutMapping("/updateBloc")
   Bloc updateBloc(@RequestBody Bloc b){
        return blocService.updateBloc(b);
    }

    @DeleteMapping("/deleteBloc/{id}")
    void deleteChambre(@PathVariable Long id){
       blocService.deleteBloc(id);
    }
}