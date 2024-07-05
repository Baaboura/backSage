package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.EcritureComptable;
import com.example.Sage_PFE.repository.EcritureComptableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EcritureComptableServiceImpl implements EcritureComptableService {
    @Autowired
    private EcritureComptableRepository ecriturecomptableRepository ;

    @Override
    public EcritureComptable saveEcritureComptable(EcritureComptable ecriturecomptable) {
        return ecriturecomptableRepository.save(ecriturecomptable);
    }

    @Override
    public List<EcritureComptable> getAllEcritureComptables() {
        return ecriturecomptableRepository.findAll();
    }

    @Override
    public EcritureComptable getEcritureComptableById(Long ecriturecomptableId) {
        Optional<EcritureComptable> ecriturecomptable = ecriturecomptableRepository.findById(ecriturecomptableId) ;
        return ecriturecomptable.get();
    }

    @Override
    public EcritureComptable updateEcritureComptable(EcritureComptable ecriturecomptable) {
        EcritureComptable existingEcritureComptable = ecriturecomptableRepository.findById(ecriturecomptable.getId()).get() ;
        existingEcritureComptable.setLibelle(ecriturecomptable.getLibelle());
        existingEcritureComptable.setReference(ecriturecomptable.getReference());
        existingEcritureComptable.setMontant(ecriturecomptable.getMontant());
        existingEcritureComptable.setDate(ecriturecomptable.getDate());
        existingEcritureComptable.setCompte(ecriturecomptable.getCompte());

        EcritureComptable updatedEcritureComptable = ecriturecomptableRepository.save(existingEcritureComptable) ;
        return updatedEcritureComptable;
    }

    @Override
    public void deleteEcritureComptable(Long ecriturecomptableId) {
        ecriturecomptableRepository.deleteById(ecriturecomptableId);

    }
}
