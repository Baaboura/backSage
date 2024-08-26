package com.example.Sage_PFE.controller;

import com.example.Sage_PFE.entity.FichierEntreprise;
import com.example.Sage_PFE.service.FichierEntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@RestController
@RequestMapping("/fichierentreprise")
public class FichierEntrepriseController {@Autowired
private FichierEntrepriseService fichierentrepriseService ;

    @PostMapping("/addFichierEntreprise")
    public ResponseEntity<?> createFichierEntreprise(@RequestBody FichierEntreprise fichierentreprise) throws IOException {
        FichierEntreprise fichierentreprise1 = fichierentrepriseService.saveFichierEntreprise(fichierentreprise) ;
        return ResponseEntity.ok(fichierentreprise1) ;
    }

    @GetMapping("/getAllFichierEntreprise")
    public ResponseEntity<List<FichierEntreprise>> getAllFichierEntreprises(){
        List<FichierEntreprise> fichierentreprises = fichierentrepriseService.getAllFichierEntreprises() ;
        return new ResponseEntity<>(fichierentreprises, HttpStatus.OK) ;
    }

    @GetMapping("/getFichierEntrepriseById/{id}")
    public ResponseEntity<FichierEntreprise> getFichierEntrepriseById(@PathVariable("id")Long fichierentrepriseId) {
        FichierEntreprise fichierentreprise = fichierentrepriseService.getFichierEntrepriseById(fichierentrepriseId);
        return new ResponseEntity<>(fichierentreprise, HttpStatus.OK);
    }

    @PutMapping("/updateFichierEntrepriseById/{id}")
    public ResponseEntity<FichierEntreprise> updateFichierEntreprise(@PathVariable("id") Long fichierentrepriseId,@RequestBody FichierEntreprise fichierentreprise){
        fichierentreprise.setId(fichierentrepriseId);
        FichierEntreprise updatedFichierEntreprise = fichierentrepriseService.updateFichierEntreprise(fichierentreprise);
        return new ResponseEntity<>(updatedFichierEntreprise, HttpStatus.OK);
    }

    @DeleteMapping("/deleteFichierEntreprise/{id}")
    public ResponseEntity<String> deleteFichierEntreprise(@PathVariable("id") Long fichierentrepriseId){
        fichierentrepriseService.deleteFichierEntreprise(fichierentrepriseId);
        return new ResponseEntity<>("FichierEntreprise successfully deleted!",HttpStatus.OK);
    }

}
