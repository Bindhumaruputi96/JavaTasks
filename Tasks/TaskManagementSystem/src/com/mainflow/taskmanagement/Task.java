package com.mainflow.taskmanagement;
import java.util.ArrayList;
import java.util.Scanner;
public class Task {
	
	    private String name;
	    private String description;
	    private String dueDate;

	    public Task(String name, String description, String dueDate) {
	        this.name = name;
	        this.description = description;
	        this.dueDate = dueDate;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public String getDueDate() {
	        return dueDate;
	    }
	}

	
	   