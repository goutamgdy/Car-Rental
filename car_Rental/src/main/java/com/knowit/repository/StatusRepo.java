package com.knowit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.knowit.entities.Status;
@Repository
public interface StatusRepo extends JpaRepository<Status, Integer> {

}