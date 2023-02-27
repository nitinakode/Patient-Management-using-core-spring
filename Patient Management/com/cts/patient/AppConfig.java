package com.cts.patient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.patient.model.Patient;
import com.cts.patient.service.PatientService;

@Configuration

public class AppConfig 
{
	@Bean
	public PatientService patientService()
	{
		PatientService p1=new PatientService();
		
		return new PatientService();
		
	}

	@Bean
	public Patient patient()
	{
		Patient p1=new Patient();
		p1.setAdmit_status("yes");
		p1.setPname("ABC");
		p1.setAge(55);
		p1.setDisease("fever");
		p1.setPid("P1000");
		p1.setSex("female");
		return p1;
		
	}
	
	
	

}
