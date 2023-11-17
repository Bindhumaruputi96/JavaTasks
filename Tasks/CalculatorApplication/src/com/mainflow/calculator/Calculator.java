package com.mainflow.calculator;
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        double result = 0.0;
		        boolean firstInput = true;

		        while (true) {
		        	System.out.print("Enter an expression (or 'done' to exit): ");
		            String input = scanner.nextLine();
		            boolean done = false;

		            if (input.equalsIgnoreCase("done"))
		            {
	                    done = true;
	    	            System.out.println("See you Again");
	    	            return;
		            }

		            	String[] tokens = input.split(" ");

		            	if (tokens.length != 3) 
		            	{
		            		System.out.println("Invalid input");
		            		continue;
		            	}


		            double num1;
		            double num2;

		            try {
		                num1 = Double.parseDouble(tokens[0]);
		                num2 = Double.parseDouble(tokens[2]);
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input");
		                continue;
		            }

		            switch (tokens[1]) {
		                case "+":
		                    result = firstInput ? num1 : result + num1;
		                    result += num2;
		                    break;
		                case "-":
		                    result = firstInput ? num1 : result - num1;
		                    result -= num2;
		                    break;
		                case "*":
		                    result = firstInput ? num1 : result * num1;
		                    result *= num2;
		                    break;
		                case "/":
		                    if (num2 == 0) {
		                        System.out.println("Cannot divide by zero");
		                        continue;
		                    }
		                    result = firstInput ? num1 : result / num1;
		                    result /= num2;
		                    break;
		                default:
		                    System.out.println("Invalid input");
		                    continue;
		            }

		            firstInput = false;
		            System.out.println(result);
		        }
		    }
		}





