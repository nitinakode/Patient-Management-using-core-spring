package com.cts.patient.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.patient.model.Patient;

public class PatientService 
{
	@Autowired
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
