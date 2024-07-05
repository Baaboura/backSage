package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.Societe;

import java.util.List;

public interface SocieteService {
    Societe saveSociete(Societe societe) ;
    List<Societe> getAllSociete() ;
    Societe getSocieteById(Long societeId) ;
    Societe updateSociete(Societe societe) ;
    void deleteSociete(Long societeId) ;

    List<Societe> getAllSocietes();
}
