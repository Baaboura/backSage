package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.FichierEntreprise;
import com.example.Sage_PFE.repository.FichierEntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FichierEntrepriseServiceImpl implements FichierEntrepriseService {
    @Autowired
    private FichierEntrepriseRepository fichierentrepriseRepository ;

    @Override
    public FichierEntreprise saveFichierEntreprise(FichierEntreprise fichierentreprise) {
        return fichierentrepriseRepository.save(fichierentreprise);

    }

    @Override
    public FichierEntreprise FichierEntreprise(FichierEntreprise fichierentreprise) {
        return fichierentrepriseRepository.save(fichierentreprise);
    }

    @Override
    public List<FichierEntreprise> getAllBFichierEntreprise() {
        return null;
    }

     @Override
    public List<FichierEntreprise> getAllFichierEntreprises() {
        return fichierentrepriseRepository.findAll();
    }

    @Override
    public FichierEntreprise getFichierEntrepriseById(Long fichierentrepriseId) {
        Optional<FichierEntreprise> fichierentreprise = fichierentrepriseRepository.findById(fichierentrepriseId) ;
        return fichierentreprise.get();
    }

    @Override
    public FichierEntreprise updateFichierEntreprise(FichierEntreprise fichierentreprise) {
        FichierEntreprise existingFichierEntreprise = fichierentrepriseRepository.findById(fichierentreprise.getId()).get() ;
        existingFichierEntreprise.setCode_compte(fichierentreprise.getCode_compte());
        existingFichierEntreprise.setDevise(fichierentreprise.getDevise());
        existingFichierEntreprise.setCode_flux(fichierentreprise.getCode_flux());
        existingFichierEntreprise.setLibelle(fichierentreprise.getLibelle());
        existingFichierEntreprise.setDate_de_transaction(fichierentreprise.getDate_de_transaction());
        existingFichierEntreprise.setMontant_de_transaction(fichierentreprise.getMontant_de_transaction());
        existingFichierEntreprise.setReference(fichierentreprise.getReference());

        FichierEntreprise updatedFichierEntreprise = fichierentrepriseRepository.save(existingFichierEntreprise) ;
        return updatedFichierEntreprise;
    }

    @Override
    public void deleteFichierEntreprise(Long fichierentrepriseId) {
        fichierentrepriseRepository.deleteById(fichierentrepriseId);

    }
}
