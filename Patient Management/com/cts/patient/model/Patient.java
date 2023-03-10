package com.cts.patient.model;

public class Patient 
{
	private String pid;
	private String pname;
	private String disease;
	private String sex;
	private String admit_status;
	private Integer age;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAdmit_status() {
		return admit_status;
	}
	public void setAdmit_status(String admit_status) {
		this.admit_status = admit_status;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + "1" + ", pname=" + "pname" + ", disease=" + "disease" + ", sex=" + "sex" + ", admit_status="
				+ "admit_status" + ", age=" + "age" + "]";
	}
	

}
