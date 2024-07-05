package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.TransactionBancaire;
import com.example.Sage_PFE.repository.TransactionBancaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionBancaireServiceImpl implements TransactionBancaireService {
    @Autowired
    private TransactionBancaireRepository transactionbancaireRepository ;

    @Override
    public TransactionBancaire saveTransactionBancaire(TransactionBancaire transactionbancaire) {
        return transactionbancaireRepository.save(transactionbancaire);
    }

    @Override
    public List<TransactionBancaire> getAllTransactionBancaires() {
        return transactionbancaireRepository.findAll();
    }

    @Override
    public TransactionBancaire getTransactionBancaireById(Long transactionbancaireId) {
        Optional<TransactionBancaire> transactionbancaire = transactionbancaireRepository.findById(transactionbancaireId) ;
        return transactionbancaire.get();
    }

    @Override
    public TransactionBancaire updateTransactionBancaire(TransactionBancaire transactionbancaire) {
        TransactionBancaire existingTransactionBancaire = transactionbancaireRepository.findById(transactionbancaire.getId()).get() ;
        existingTransactionBancaire.setLibelle(transactionbancaire.getLibelle());
        existingTransactionBancaire.setReference(transactionbancaire.getReference());
        existingTransactionBancaire.setMontant(transactionbancaire.getMontant());
        existingTransactionBancaire.setDate(transactionbancaire.getDate());
        existingTransactionBancaire.setCompte(transactionbancaire.getCompte());

        TransactionBancaire updatedTransactionBancaire = transactionbancaireRepository.save(existingTransactionBancaire) ;
        return updatedTransactionBancaire;
    }

    @Override
    public void deleteTransactionBancaire(Long transactionbancaireId) {
        transactionbancaireRepository.deleteById(transactionbancaireId);

    }
}
