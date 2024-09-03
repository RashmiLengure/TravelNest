package com.travelnest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelnest.entities.CarType;

@Repository
public interface CarTypeRepository extends JpaRepository<CarType,Integer> {

}
