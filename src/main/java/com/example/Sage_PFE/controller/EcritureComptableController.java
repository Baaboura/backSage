package com.example.Sage_PFE.controller;

import com.example.Sage_PFE.entity.EcritureComptable;
import com.example.Sage_PFE.service.EcritureComptableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/ecriturecomptable")
public class EcritureComptableController {
    @Autowired
    private EcritureComptableService ecriturecomptableService ;

    @PostMapping("/addEcritureComptable")
    public ResponseEntity<?> createEcritureComptable(@RequestBody EcritureComptable ecriturecomptable) throws IOException {
        EcritureComptable ecriturecomptable1 = ecriturecomptableService.saveEcritureComptable(ecriturecomptable) ;
        return ResponseEntity.ok(ecriturecomptable1) ;
    }

    @GetMapping("/getAllEcritureComptables")
    public ResponseEntity<List<EcritureComptable>> getAllEcritureComptables(){
        List<EcritureComptable> ecriturecomptables = ecriturecomptableService.getAllEcritureComptables() ;
        return new ResponseEntity<>(ecriturecomptables, HttpStatus.OK) ;
    }

    @GetMapping("/getEcritureComptableById/{id}")
    public ResponseEntity<EcritureComptable> getEcritureComptableById(@PathVariable("id")Long ecriturecomptableId) {
        EcritureComptable ecriturecomptable = ecriturecomptableService.getEcritureComptableById(ecriturecomptableId);
        return new ResponseEntity<>(ecriturecomptable, HttpStatus.OK);
    }

    @PutMapping("/updateEcritureComptableById/{id}")
    public ResponseEntity<EcritureComptable> updateEcritureComptable(@PathVariable("id") Long ecriturecomptableId,@RequestBody EcritureComptable ecriturecomptable){
        ecriturecomptable.setId(ecriturecomptableId);
        EcritureComptable updatedEcritureComptable = ecriturecomptableService.updateEcritureComptable(ecriturecomptable);
        return new ResponseEntity<>(updatedEcritureComptable, HttpStatus.OK);
    }

    @DeleteMapping("/deleteEcritureComptable/{id}")
    public ResponseEntity<String> deleteEcritureComptable(@PathVariable("id") Long ecriturecomptableId){
        ecriturecomptableService.deleteEcritureComptable(ecriturecomptableId);
        return new ResponseEntity<>("EcritureComptable successfully deleted!",HttpStatus.OK);
    }
}
