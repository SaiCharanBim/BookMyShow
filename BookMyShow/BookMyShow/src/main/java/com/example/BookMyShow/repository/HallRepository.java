package com.example.BookMyShow.repository;

import com.example.BookMyShow.models.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface HallRepository extends JpaRepository<Hall, UUID> {
}
