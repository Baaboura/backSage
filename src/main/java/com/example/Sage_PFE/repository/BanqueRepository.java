package com.example.Sage_PFE.repository;

import com.example.Sage_PFE.entity.Banque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanqueRepository extends JpaRepository<Banque,Long>{

}
