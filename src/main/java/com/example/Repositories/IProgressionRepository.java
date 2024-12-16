package com.example.Repositories;

import com.example.Entities.Progression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProgressionRepository extends JpaRepository<Progression, Long> {
}
