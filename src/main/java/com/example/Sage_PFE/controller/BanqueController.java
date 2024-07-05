package com.example.Sage_PFE.controller;

import com.example.Sage_PFE.entity.Banque;
import com.example.Sage_PFE.service.BanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/banque")
public class BanqueController {
    @Autowired
    private BanqueService banqueService ;

    @PostMapping("/addBanque")
    public ResponseEntity<?> createBanque(@RequestBody Banque banque) throws IOException {
        Banque banque1 = banqueService.saveBanque(banque) ;
        return ResponseEntity.ok(banque1) ;
    }

    @GetMapping("/getAllBanques")
    public ResponseEntity<List<Banque>> getAllBanques(){
        List<Banque> banques = banqueService.getAllBanques() ;
        return new ResponseEntity<>(banques, HttpStatus.OK) ;
    }

@GetMapping("/getBanqueById/{id}")
    public ResponseEntity<Banque> getBanqueById(@PathVariable("id")Long banqueId) {
        Banque banque = banqueService.getBanqueById(banqueId);
        return new ResponseEntity<>(banque, HttpStatus.OK);
    }

    @PutMapping("/updateBanqueById/{id}")
    public ResponseEntity<Banque> updateBanque(@PathVariable("id") Long banqueId,@RequestBody Banque banque){
        banque.setId(banqueId);
        Banque updatedBanque = banqueService.updateBanque(banque);
        return new ResponseEntity<>(updatedBanque, HttpStatus.OK);
    }

    @DeleteMapping("/deleteBanque/{id}")
    public ResponseEntity<String> deleteBanque(@PathVariable("id") Long banqueId){
        banqueService.deleteBanque(banqueId);
        return new ResponseEntity<>("Banque successfully deleted!",HttpStatus.OK);
    }
}
