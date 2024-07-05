package com.example.Sage_PFE.controller;

import com.example.Sage_PFE.entity.TransactionBancaire;
import com.example.Sage_PFE.service.TransactionBancaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/transactionbancaire")
public class TransactionBancaireController {
    @Autowired
    private TransactionBancaireService transactionbancaireService ;

    @PostMapping("/addTransactionBancaire")
    public ResponseEntity<?> createTransactionBancaire(@RequestBody TransactionBancaire transactionbancaire) throws IOException {
        TransactionBancaire transactionbancaire1 = transactionbancaireService.saveTransactionBancaire(transactionbancaire) ;
        return ResponseEntity.ok(transactionbancaire1) ;
    }

    @GetMapping("/getAllTransactionBancaires")
    public ResponseEntity<List<TransactionBancaire>> getAllTransactionBancaires(){
        List<TransactionBancaire> transactionbancaires = transactionbancaireService.getAllTransactionBancaires() ;
        return new ResponseEntity<>(transactionbancaires, HttpStatus.OK) ;
    }

    @GetMapping("/getTransactionBancaireById/{id}")
    public ResponseEntity<TransactionBancaire> getTransactionBancaireById(@PathVariable("id")Long transactionbancaireId) {
        TransactionBancaire transactionbancaire = transactionbancaireService.getTransactionBancaireById(transactionbancaireId);
        return new ResponseEntity<>(transactionbancaire, HttpStatus.OK);
    }

    @PutMapping("/updateTransactionBancaireById/{id}")
    public ResponseEntity<TransactionBancaire> updateTransactionBancaire(@PathVariable("id") Long transactionbancaireId,@RequestBody TransactionBancaire transactionbancaire){
        transactionbancaire.setId(transactionbancaireId);
        TransactionBancaire updatedTransactionBancaire = transactionbancaireService.updateTransactionBancaire(transactionbancaire);
        return new ResponseEntity<>(updatedTransactionBancaire, HttpStatus.OK);
    }

    @DeleteMapping("/deleteTransactionBancaire/{id}")
    public ResponseEntity<String> deleteTransactionBancaire(@PathVariable("id") Long transactionbancaireId){
        transactionbancaireService.deleteTransactionBancaire(transactionbancaireId);
        return new ResponseEntity<>("TransactionBancaire successfully deleted!",HttpStatus.OK);
    }
}
