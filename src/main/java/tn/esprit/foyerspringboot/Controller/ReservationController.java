package tn.esprit.foyerspringboot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.entities.Foyer;
import tn.esprit.foyerspringboot.entities.Reservation;
import tn.esprit.foyerspringboot.services.IFoyerService;
import tn.esprit.foyerspringboot.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    IReservationService reservationService;

    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation r){
        return reservationService.addReservation(r);
    }

    @GetMapping("/findAll")
    List<Reservation> findAll(){
        return reservationService.getAllReservation();
    }

    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation r){
        return reservationService.updateReservation(r);
    }

    @DeleteMapping("/deleteReservation/{id}")
    void deleteReservation(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
}