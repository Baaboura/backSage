package com.example.Sage_PFE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Myentity {
    @Id
    private Long id;

}

