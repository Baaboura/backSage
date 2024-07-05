package com.example.Sage_PFE.controller;

import com.example.Sage_PFE.entity.Societe;
import com.example.Sage_PFE.service.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/societe")
public class SocieteController {
    @Autowired
    private SocieteService societeService ;

    @PostMapping("/addSociete")
    public ResponseEntity<?> createSociete(@RequestBody Societe societe) throws IOException {
        Societe societe1 = societeService.saveSociete(societe) ;
        return ResponseEntity.ok(societe1) ;
    }

    @GetMapping("/getAllSociete")
    public ResponseEntity<List<Societe>> getAllSocietes(){
        List<Societe> societes = societeService.getAllSocietes() ;
        return new ResponseEntity<>(societes, HttpStatus.OK) ;
    }

    @GetMapping("/getSocieteById/{id}")
    public ResponseEntity<Societe> getSocieteById(@PathVariable("id")Long societeId) {
        Societe societe = societeService.getSocieteById(societeId);
        return new ResponseEntity<>(societe, HttpStatus.OK);
    }

    @PutMapping("/updateSocieteById/{id}")
    public ResponseEntity<Societe> updateSociete(@PathVariable("id") Long societeId,@RequestBody Societe societe){
        societe.setId(societeId);
        Societe updatedSociete = societeService.updateSociete(societe);
        return new ResponseEntity<>(updatedSociete, HttpStatus.OK);
    }

    @DeleteMapping("/deleteSociete/{id}")
    public ResponseEntity<String> deleteSociete(@PathVariable("id") Long societeId){
        societeService.deleteSociete(societeId);
        return new ResponseEntity<>("Societe successfully deleted!",HttpStatus.OK);
    }
}