package org.example.workapi.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<EntityPerson, Long> {
    List<EntityPerson> findByAnswer(boolean answer);
}

