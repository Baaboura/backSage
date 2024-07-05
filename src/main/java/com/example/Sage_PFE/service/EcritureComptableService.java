package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.EcritureComptable;

import java.util.List;

public interface EcritureComptableService {
    EcritureComptable saveEcritureComptable(EcritureComptable ecriturecomptable) ;
    List<EcritureComptable> getAllEcritureComptables() ;
    EcritureComptable getEcritureComptableById(Long ecriturecomptableId) ;
    EcritureComptable updateEcritureComptable(EcritureComptable ecriturecomptable) ;
    void deleteEcritureComptable(Long ecriturecomptableId) ;
}
