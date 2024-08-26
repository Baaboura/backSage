package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.FichierEntreprise;

import java.util.List;

public interface FichierEntrepriseService {
    FichierEntreprise saveFichierEntreprise(FichierEntreprise fichierentreprise) ;

    FichierEntreprise FichierEntreprise(FichierEntreprise fichierentreprise);

    List<FichierEntreprise> getAllBFichierEntreprise() ;

    List<FichierEntreprise> getAllFichierEntreprises();

    FichierEntreprise getFichierEntrepriseById(Long fichierentrepriseId) ;
    FichierEntreprise updateFichierEntreprise(FichierEntreprise fichierentreprise) ;
    void deleteFichierEntreprise(Long fichierentrepriseId) ;
}
