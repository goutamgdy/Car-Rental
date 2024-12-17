package com.knowit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.knowit.entities.City;
@Repository
public interface CityRepo extends JpaRepository<City, Integer> {

}