package com.example.Sage_PFE.repository;

import com.example.Sage_PFE.entity.Myentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface IRrepo extends JpaRepository<Myentity, Event.ID> {

}
