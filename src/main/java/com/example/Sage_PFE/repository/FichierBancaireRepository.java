package com.example.Sage_PFE.repository;

import com.example.Sage_PFE.entity.FichierBancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FichierBancaireRepository extends JpaRepository<FichierBancaire,Long> {
}
