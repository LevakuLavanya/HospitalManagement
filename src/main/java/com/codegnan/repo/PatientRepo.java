package com.codegnan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codegnan.entity.Doctor;
import com.codegnan.entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

	List<Patient> findAllByDoctor(Doctor doctor);

}
