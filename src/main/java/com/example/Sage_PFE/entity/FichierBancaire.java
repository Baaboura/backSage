package com.example.Sage_PFE.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FichierBancaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dateDeCreation;
    private String codeCompte;
    private String Rib;
    private String devise;
    private Long montantInitial;
    private Long montantFinal;
    private  String fileName;
}
