/**
 * This program demonstrates how to use the double variable type to calculate total wages of a worker
 * 
 * &author Ryan Hickman
 * 
 */




public class Wages 
{
	public static void main (String[] args)
	{
		
		double regularWages;		//The calculated regular wages
		double basePay = 25;		//The base pay rate
		double regularHours = 40;	//The hours worked less overtime
		double overtimeWages;		//Overtime wages
		double overtimePay = 37.5;	//Overtime pay rate
		double overtimeHours = 10;	//Overtime hours worked
		double totalWages;			//Total wages
		
		regularWages = basePay * regularHours;							// Calculates what the worker's regular wages are before overtime
		overtimeWages = overtimePay * overtimeHours;					// Calculates the worker's overtime pay
		totalWages = regularWages + overtimeWages;						// Calculates the worker's total pay
		System.out.println("wages for this week are $" + totalWages);	//Displayes the worker's total wages earned for the week.
	}

}
