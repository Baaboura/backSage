package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.Banque;
import com.example.Sage_PFE.repository.BanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BanqueServiceImpl implements BanqueService {
    @Autowired
    private BanqueRepository banqueRepository ;

    @Override
    public Banque saveBanque(Banque banque) {
        return banqueRepository.save(banque);
    }

    @Override
    public List<Banque> getAllBanques() {
        return banqueRepository.findAll();
    }

    @Override
    public Banque getBanqueById(Long banqueId) {
        Optional<Banque> banque = banqueRepository.findById(banqueId) ;
        return banque.get();
    }

    @Override
    public Banque updateBanque(Banque banque) {
        Banque existingBanque = banqueRepository.findById(banque.getId()).get() ;
        existingBanque.setNom(banque.getNom());
        existingBanque.setUrl(banque.getUrl());
        existingBanque.setMotdepasse(banque.getMotdepasse());

        Banque updatedBanque = banqueRepository.save(existingBanque) ;
        return updatedBanque;
    }

    @Override
    public void deleteBanque(Long banqueId) {
        banqueRepository.deleteById(banqueId);

    }
}
