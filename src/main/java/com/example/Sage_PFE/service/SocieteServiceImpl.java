package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.Societe;
import com.example.Sage_PFE.repository.SocieteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocieteServiceImpl implements SocieteService {
    @Autowired
    private SocieteRepository societeRepository ;

    //@Override
    //public Societe saveSociete(Societe societe) {
      //  return societeRepository.save(societe);
    //}

    //@Override
    //public List<Societe> getAllSociete() {
      //  return null;
    //}

    @Override
    public List<Societe> getAllSociete() {
        return societeRepository.findAll();
    }

    @Override
    public Societe saveSociete(Societe societe) {
        return null;
    }

    @Override
    public Societe getSocieteById(Long societeId) {
        Optional<Societe> societe = societeRepository.findById(societeId) ;
        return societe.get();
    }

    @Override
    public Societe updateSociete(Societe societe) {
        Societe existingSociete = societeRepository.findById(societe.getId()).get() ;
        existingSociete.setNom(societe.getNom());
        existingSociete.setUrl(societe.getUrl());
        existingSociete.setMotdepasse(societe.getMotdepasse());

        Societe updatedSociete = societeRepository.save(existingSociete) ;
        return updatedSociete;
    }

    @Override
    public void deleteSociete(Long societeId) {
        societeRepository.deleteById(societeId);
    }

    @Override
    public List<Societe> getAllSocietes() {
        return null;
    }
}
