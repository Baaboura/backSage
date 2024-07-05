package com.example.Sage_PFE.controller;

import com.example.Sage_PFE.entity.FichierBancaire;
import com.example.Sage_PFE.service.FichierBancaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/fichierbancaire")
public class FichierBancaireController {
    @Autowired
    private FichierBancaireService fichierbancaireService ;

    @PostMapping("/addFichierBancaire")
    public ResponseEntity<?> createFichierBancaire(@RequestBody FichierBancaire fichierbancaire) throws IOException {
        FichierBancaire fichierbancaire1 = fichierbancaireService.saveFichierBancaire(fichierbancaire) ;
        return ResponseEntity.ok(fichierbancaire1) ;
    }

    @GetMapping("/getAllFichierBancaires")
    public ResponseEntity<List<FichierBancaire>> getAllFichierBancaires(){
        List<FichierBancaire> fichierbancaires = fichierbancaireService.getAllFichierBancaires() ;
        return new ResponseEntity<>(fichierbancaires, HttpStatus.OK) ;
    }

    @GetMapping("/getFichierBancaireById/{id}")
    public ResponseEntity<FichierBancaire> getFichierBancaireById(@PathVariable("id")Long fichierbancaireId) {
        FichierBancaire fichierbancaire = fichierbancaireService.getFichierBancaireById(fichierbancaireId);
        return new ResponseEntity<>(fichierbancaire, HttpStatus.OK);
    }

    @PutMapping("/updateFichierBancaireById/{id}")
    public ResponseEntity<FichierBancaire> updateFichierBancaire(@PathVariable("id") Long fichierbancaireId,@RequestBody FichierBancaire fichierbancaire){
        fichierbancaire.setId(fichierbancaireId);
        FichierBancaire updatedFichierBancaire = fichierbancaireService.updateFichierBancaire(fichierbancaire);
        return new ResponseEntity<>(updatedFichierBancaire, HttpStatus.OK);
    }

    @DeleteMapping("/deleteFichierBancaire/{id}")
    public ResponseEntity<String> deleteFichierBancaire(@PathVariable("id") Long fichierbancaireId){
        fichierbancaireService.deleteFichierBancaire(fichierbancaireId);
        return new ResponseEntity<>("FichierBancaire successfully deleted!",HttpStatus.OK);
    }
}
