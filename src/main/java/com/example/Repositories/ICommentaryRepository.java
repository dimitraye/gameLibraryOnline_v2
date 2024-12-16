package com.example.Repositories;

import com.example.Entities.Commentary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentaryRepository extends JpaRepository<Commentary, Long> {
}
