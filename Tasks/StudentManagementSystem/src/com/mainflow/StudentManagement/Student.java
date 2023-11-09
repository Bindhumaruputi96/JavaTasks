package com.mainflow.StudentManagement;

public class Student {
	
		  private String name;
		    private int id;
		    private int age;
		    private String address;
		    private String email;
		    private double gpa;
		    private int totalSubjects;
		    private int totalAttendance;

		    public Student(int id, String name, int age, String address, String email) {
		        this.id = id;
		        this.name = name;
		        this.age = age;
		        this.address = address;
		        this.email = email;
		        this.gpa = 0.0;
		        this.totalSubjects = 0;
		        this.totalAttendance = 0;
		        
		    }

		    public int getId() {
		        return id;
		    }

		    public String getName() {
		        return name;
		    }

		    public int getAge() {
		        return age;
		    }

		    public String getAddress() {
		        return address;
		    }

		    public String getEmail() {
		        return email;
		    }

		    public double getGPA() {
		        return gpa;
		    }

		    public int getTotalSubjects() {
		        return totalSubjects;
		    }

		    public int getTotalAttendance() {
		        return totalAttendance;
		    }

		    public void updateGPA(double grade) {
		        gpa = (gpa * totalSubjects + grade) / (totalSubjects + 1);
		        totalSubjects++;
		    }

		    public void markAttendance() {
		        totalAttendance++;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public void setAge(int age) {
		        this.age = age;
		    }

		    public void setAddress(String address) {
		        this.address = address;
		    }

		    public void setEmail(String email) {
		        this.email = email;
		    }

		    public String toString() {
		        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Address: " + address + ", Email: " + email +
		                ", GPA: " + gpa + ", Attendance: " + totalAttendance + " out of " + totalSubjects;
		    }
	    
		   
	}


