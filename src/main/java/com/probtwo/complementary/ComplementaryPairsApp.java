package com.probtwo.complementary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplementaryPairsApp {

	public static void main(String[] args) {
		
		int[] inputArray = new int[args.length];
//		Scanner input = new Scanner(System.in);

		try {
			
			if(args.length == 0) {
				System.err.println("Error: the program must be run with integer values for the array.");
			}else {
				displayInfo();
				
//				System.out.print("\nEnter the value of K: ");
//				int target = input.nextInt();
//				
//				for(int i=0;i < args.length;i++) {
//					inputArray[i] = Integer.parseInt(args[i]);
//				}
				
				inputArray = processArgs(args);
				int target = obtainTarget();
				int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
				displayResults(pairs);
			}		
			
		}catch(NumberFormatException nfe) {
			System.err.println("Error: Array elements must be integers.");
		}catch(InputMismatchException ime) {
			System.err.println("Error: K must be an integer.");
		}

	}
	
	
	public static void displayInfo() {
		System.out.println("\nComplementaryPairs is an application that process an integer array and returns the number of \n"
				+	"K-complementary pairs for an integer K.\n" 
				+ "Run the program with a list of integers that represent the array elements, separated by spaces.\n");
	}
	
	
	public static int[] processArgs(String[] arguments)   throws NumberFormatException{
		int[] arrInt = new int[arguments.length];
		for(int i=0;i < arguments.length;i++) {
			arrInt[i] = Integer.parseInt(arguments[i]);
		}
		return arrInt;
	}
	
	
	public static int obtainTarget() throws InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the value of K: ");
		int target = input.nextInt();
		System.out.println();
		input.close();
		return target;		
	}
	
	public static void displayResults(int pairs) {
		System.out.println("\n" + pairs + " pairs found.");
		System.out.println();
	}

}



