package com.greatlearning.main;

import com.greatlearning.model.AdminDepartment;        //imported AdminDepartment from model package to main
import com.greatlearning.model.HrDepartment;          //imported HrDepartment from model package to main
import com.greatlearning.model.TechnicalDepartment;   //imported TechnicalDepartment from model package to main

public class Driver {
	public static void main(String[] args) {
     
		 AdminDepartment admin = new AdminDepartment(); 	   	 //object admin created of Super class AdminDepartment
         HrDepartment hr = new HrDepartment();         			 //object hr created of Super class HrDepartment
         TechnicalDepartment tech = new TechnicalDepartment();   //object tech created of Super class TechnicalDepartment
         
         
	     System.out.println("Welcome to " +admin.departmentName());
	     System.out.println(admin.getTodaysWork());
	     System.out.println(admin.getWorkDeadline());
	     System.out.println(admin.isTodayAHoliday()+"\n");
	     System.out.println("Welcome to " +hr.departmentName());
	     System.out.println(hr.doActivity());
	     System.out.println(hr.getTodaysWork());
	     System.out.println(hr.getWorkDeadline());
	     System.out.println(hr.isTodayAHoliday()+"\n");
	     System.out.println("Welcome to "+tech.departmentName());
	     System.out.println(tech.getTodaysWork());
	     System.out.println(tech.getWorkDeadline());
	     System.out.println(tech.getTechStackInformation());
	     System.out.println(tech.isTodayAHoliday());	
	       
		}	

	}

