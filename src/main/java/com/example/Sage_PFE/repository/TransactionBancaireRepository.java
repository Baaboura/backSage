package com.example.Sage_PFE.repository;

import com.example.Sage_PFE.entity.TransactionBancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionBancaireRepository extends JpaRepository<TransactionBancaire,Long> {

}
