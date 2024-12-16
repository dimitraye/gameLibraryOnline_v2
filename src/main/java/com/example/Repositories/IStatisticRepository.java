package com.example.Repositories;


import com.example.Entities.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatisticRepository extends JpaRepository<Statistic, Long> {
}
