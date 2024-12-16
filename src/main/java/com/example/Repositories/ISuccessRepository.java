package com.example.Repositories;

import com.example.Entities.Success;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISuccessRepository extends JpaRepository<Success, Long> {
}
