package org.tat.fni.api.domain.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.tat.fni.api.domain.MedicalProposalInsuredPersonGuardian;

public interface GuardianRepository
    extends JpaRepository<MedicalProposalInsuredPersonGuardian, String> {

  @Query(value = "SELECT * FROM MEDICALPROPOSAL_GUARDIAN", nativeQuery = true)
  List<Object[]> findAllNativeObject();

  @Query(
      value = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'MEDICALPROPOSAL_GUARDIAN'",
      nativeQuery = true)
  List<Object> findAllColumnName();

}
