package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.TransactionBancaire;

import java.util.List;

public interface TransactionBancaireService {
    TransactionBancaire saveTransactionBancaire(TransactionBancaire transactionbancaire) ;
    List<TransactionBancaire> getAllTransactionBancaires() ;
    TransactionBancaire getTransactionBancaireById(Long transactionbancaireId) ;
    TransactionBancaire updateTransactionBancaire(TransactionBancaire transactionbancaire) ;
    void deleteTransactionBancaire(Long transactionbancaireId) ;
}
