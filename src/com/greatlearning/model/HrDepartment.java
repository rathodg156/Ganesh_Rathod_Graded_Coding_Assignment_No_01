package com.greatlearning.model;

public class HrDepartment extends SuperDepartment
	{
		public String departmentName()
			{ 
				return "HR Department";
			} 
		public String getTodaysWork()
			{ 
				return "Fill Today's marksheet and mark your attendance";
			}
		public String getWorkDeadline()
			{
				return "Complete by EOD";
			}
		public String doActivity()
			{
				return "Team Launch";
			}
	}


