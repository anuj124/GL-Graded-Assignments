package com.greatlearning.service;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		return("Hr Department");
	}
	
	public String getTodaysWork() {
		return("FIll today's worksheet and mark your attendence");
	}
	
	public String getWorkDeadline() {
		return("Complete by EOD");
	}
	
	public String doActivity() {
		return("team Lunch");
	}

}
