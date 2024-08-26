package com.example.Sage_PFE.repository;

import com.example.Sage_PFE.entity.FichierEntreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FichierEntrepriseRepository extends JpaRepository<FichierEntreprise,Long> {
}
