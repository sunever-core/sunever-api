package com.jovicsantos.suneverapi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jovicsantos.suneverapi.models.MeasurementModel;

public interface MeasurementRepository extends JpaRepository<MeasurementModel, UUID> {
  boolean existsByName(String name);
}