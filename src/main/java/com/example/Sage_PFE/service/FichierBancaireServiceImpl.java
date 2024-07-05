package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.FichierBancaire;
import com.example.Sage_PFE.repository.FichierBancaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FichierBancaireServiceImpl implements FichierBancaireService {
    @Autowired
    private FichierBancaireRepository fichierbancaireRepository ;

    @Override
    public FichierBancaire saveFichierBancaire(FichierBancaire fichierbancaire) {
        return fichierbancaireRepository.save(fichierbancaire);
    }

    @Override
    public List<FichierBancaire> getAllBFichierBancaire() {
        return null;
    }

    @Override
    public List<FichierBancaire> getAllFichierBancaires() {
        return fichierbancaireRepository.findAll();
    }

    @Override
    public FichierBancaire getFichierBancaireById(Long fichierbancaireId) {
        Optional<FichierBancaire> fichierbancaire = fichierbancaireRepository.findById(fichierbancaireId) ;
        return fichierbancaire.get();
    }

    @Override
    public FichierBancaire updateFichierBancaire(FichierBancaire fichierbancaire) {
        FichierBancaire existingFichierBancaire = fichierbancaireRepository.findById(fichierbancaire.getId()).get() ;
        existingFichierBancaire.setNom(fichierbancaire.getNom());
        existingFichierBancaire.setFormat(fichierbancaire.getFormat());
        existingFichierBancaire.setContenu(fichierbancaire.getContenu());

        FichierBancaire updatedFichierBancaire = fichierbancaireRepository.save(existingFichierBancaire) ;
        return updatedFichierBancaire;
    }

    @Override
    public void deleteFichierBancaire(Long fichierbancaireId) {
        fichierbancaireRepository.deleteById(fichierbancaireId);

    }}
