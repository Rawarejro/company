package com.wsiz.company.repository;

import com.wsiz.company.model.EmpsalaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpsalaryRepository extends JpaRepository<EmpsalaryEntity, Long> {
}
