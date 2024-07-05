package com.example.Sage_PFE.repository;

import com.example.Sage_PFE.entity.EcritureComptable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcritureComptableRepository extends JpaRepository<EcritureComptable,Long> {
}
