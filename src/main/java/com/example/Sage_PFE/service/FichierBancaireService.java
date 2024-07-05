package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.FichierBancaire;

import java.util.List;

public interface FichierBancaireService {
    FichierBancaire saveFichierBancaire(FichierBancaire fichierbancaire) ;
    List<FichierBancaire> getAllBFichierBancaire() ;

    List<FichierBancaire> getAllFichierBancaires();

    FichierBancaire getFichierBancaireById(Long fichierbancaireId) ;
    FichierBancaire updateFichierBancaire(FichierBancaire fichierbancaire) ;
    void deleteFichierBancaire(Long fichierbancaireId) ;
}
