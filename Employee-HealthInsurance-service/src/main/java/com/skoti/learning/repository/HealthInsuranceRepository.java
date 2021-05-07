package com.skoti.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skoti.learning.entity.HealthInsuranceSchema;

@Repository
public interface HealthInsuranceRepository  extends JpaRepository<HealthInsuranceSchema, Integer>{

}
