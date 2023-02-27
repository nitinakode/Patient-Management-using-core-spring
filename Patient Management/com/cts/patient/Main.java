package com.cts.patient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.patient.service.PatientService;

public class Main {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		// TODO Auto-generated method stub
		PatientService p=(PatientService)context.getBean(PatientService.class);
		System.out.println("Patient Id :"+p.getPatient().getPid());
		System.out.println("Patient Name :"+p.getPatient().getPname());
		System.out.println("Disease :"+p.getPatient().getDisease());
		System.out.println("Sex :"+p.getPatient().getSex());
		System.out.println("Admit Status :"+p.getPatient().getAdmit_status());
		System.out.println("Age :"+p.getPatient().getAge());
		
	}

}
