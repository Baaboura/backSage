package com.example.Sage_PFE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banque {
    @Id
    @GeneratedValue
    private Long id;
    private String url;
    private String nom;
    private String motdepasse;
}
