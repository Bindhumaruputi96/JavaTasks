package com.mainflow.StudentManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Student> studentList = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        int idCounter = 1;

	        while (true) {
	            printMenu();

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    addStudent(studentList, idCounter, scanner);
	                    idCounter++;
	                    break;

	                case 2:
	                    viewStudents(studentList);
	                    break;

	                case 3:
	                    updateStudent(studentList, scanner);
	                    break;

	                case 4:
	                    deleteStudent(studentList, scanner);
	                    break;

	                case 5:
	                    searchStudent(studentList, scanner);
	                    break;

	                case 6:
	                    updateGPA(studentList, scanner);
	                    break;

	                case 7:
	                    markAttendance(studentList, scanner);
	                    break;


	                case 8:
	                    System.out.println("Exiting Student Management System.");
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void printMenu() {
	        System.out.println("\nStudent Management System");
	        System.out.println("1. Add Student");
	        System.out.println("2. View Students");
	        System.out.println("3. Update Student");
	        System.out.println("4. Delete Student");
	        System.out.println("5. Search Student by ID");
	        System.out.println("6. To Update Gpa");
	        System.out.println("7. To markAttendance");
	        System.out.println("8. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    private static void addStudent(ArrayList<Student> studentList, int idCounter, Scanner scanner) {
	        System.out.print("Enter student name: ");
	        String name = scanner.next();
	        System.out.print("Enter student age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character
	        System.out.print("Enter student address: ");
	        String address = scanner.nextLine();
	        System.out.print("Enter student email: ");
	        String email = scanner.next();

	        Student student = new Student(idCounter, name, age, address, email);
	        studentList.add(student);
	        System.out.println("Student added successfully with ID: " + idCounter);
	    }

	    private static void viewStudents(ArrayList<Student> studentList) {
	        if (studentList.isEmpty()) {
	            System.out.println("No students to display.");
	        } else {
	            System.out.println("List of Students:");
	            for (Student s : studentList) {
	                System.out.println(s);
	            }
	        }
	    }

	    private static void updateStudent(ArrayList<Student> studentList, Scanner scanner) {
	        System.out.print("Enter the ID of the student to update: ");
	        int updateId = scanner.nextInt();

	        boolean updated = false;
	        for (Student s : studentList) {
	            if (s.getId() == updateId) {
	                System.out.print("Enter the new name for the student: ");
	                String newName = scanner.next();
	                System.out.print("Enter the new age for the student: ");
	                int newAge = scanner.nextInt();
	                scanner.nextLine(); // Consume the newline character
	                System.out.print("Enter the new address for the student: ");
	                String newAddress = scanner.nextLine();
	                System.out.print("Enter the new email for the student: ");
	                String newEmail = scanner.next();

	                s.setName(newName);
	                s.setAge(newAge);
	                s.setAddress(newAddress);
	                s.setEmail(newEmail);
	                System.out.println("Student with ID " + updateId + " updated successfully.");
	                updated = true;
	                break;
	            }
	        }

	        if (!updated) {
	            System.out.println("Student not found with ID " + updateId);
	        }
	    }

	    private static void deleteStudent(ArrayList<Student> studentList, Scanner scanner) {
	        System.out.print("Enter the ID of the student to delete: ");
	        int deleteId = scanner.nextInt();

	        boolean deleted = false;
	        for (Student s : studentList) {
	            if (s.getId() == deleteId) {
	                studentList.remove(s);
	                System.out.println("Student with ID " + deleteId + " deleted successfully.");
	                deleted = true;
	                break;
	            }
	        }

	        if (!deleted) {
	            System.out.println("Student not found with ID " + deleteId);
	        }
	    }

	    private static void searchStudent(ArrayList<Student> studentList, Scanner scanner) {
	        System.out.print("Enter the ID of the student to search: ");
	        int searchId = scanner.nextInt();

	        boolean found = false;
	        for (Student s : studentList) {
	            if (s.getId() == searchId) {
	                System.out.println("Student found: " + s);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Student not found with ID " + searchId);
	        }
	    }

	
	    private static void updateGPA(ArrayList<Student> studentList, Scanner scanner) {
	        System.out.print("Enter the ID of the student to update GPA: ");
	        int updateId = scanner.nextInt();

	        System.out.print("Enter the new GPA for the student: ");
	        double newGPA = scanner.nextDouble();

	        for (Student s : studentList) {
	            if (s.getId() == updateId) {
	                s.updateGPA(newGPA);
	                System.out.println("GPA for student with ID " + updateId + " updated successfully.");
	                return;
	            }
	        }

	        System.out.println("Student not found with ID " + updateId);
	    }

	    private static void markAttendance(ArrayList<Student> studentList, Scanner scanner) {
	        System.out.print("Enter the ID of the student to mark attendance: ");
	        int studentId = scanner.nextInt();

	        for (Student s : studentList) {
	            if (s.getId() == studentId) {
	                s.markAttendance();
	                System.out.println("Attendance marked for student with ID " + studentId);
	                return;
	            }
	        }

	        System.out.println("Student not found with ID " + studentId);
	    }
	

	      
	}