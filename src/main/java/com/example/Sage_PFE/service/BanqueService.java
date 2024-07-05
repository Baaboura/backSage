package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.Banque;

import java.util.List;

public interface BanqueService {
    Banque saveBanque(Banque banque) ;
    List<Banque> getAllBanques() ;
    Banque getBanqueById(Long banqueId) ;
    Banque updateBanque(Banque banque) ;
    void deleteBanque(Long banqueId) ;

}
