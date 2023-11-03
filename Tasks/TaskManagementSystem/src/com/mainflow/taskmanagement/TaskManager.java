package com.mainflow.taskmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
	 public static void main(String[] args) {
	        ArrayList<Task> tasks = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Task Management System");
	            System.out.println("1. Add Task");
	            System.out.println("2. Remove Task");
	            System.out.println("3. List Tasks");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter task name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter task description: ");
	                    String description = scanner.nextLine();
	                    System.out.print("Enter due date: ");
	                    String dueDate = scanner.nextLine();

	                    Task newTask = new Task(name, description, dueDate);
	                    tasks.add(newTask);
	                    System.out.println("Task added successfully!");
	                    break;

	                case 2:
	                    System.out.print("Enter task name to remove: ");
	                    String taskToRemove = scanner.nextLine();

	                    for (int i = 0; i < tasks.size(); i++) {
	                        if (tasks.get(i).getName().equals(taskToRemove)) {
	                            tasks.remove(i);
	                            System.out.println("Task removed successfully!");
	                            break;
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.println("List of Tasks:");
	                    for (Task task : tasks) {
	                        System.out.println("Name: " + task.getName());
	                        System.out.println("Description: " + task.getDescription());
	                        System.out.println("Due Date: " + task.getDueDate());
	                        System.out.println("--------------");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting Task Management System.");
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	    }
	}






