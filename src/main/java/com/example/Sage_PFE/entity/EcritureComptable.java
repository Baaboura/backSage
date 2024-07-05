package com.example.Sage_PFE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EcritureComptable {
    @Id
    @GeneratedValue
    private Long id;
    private String libelle;
    private String reference;
    private Float montant;
    private String compte;
    private Date date;
}
