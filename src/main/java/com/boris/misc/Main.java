package com.boris.misc;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello From Misc!");
		int year = 1965;
		int gender = 2;
		System.out.println("Kua Number for gender " + gender + " and year " + year + " is " 
		+ computeKuaNumber(year, gender));
	}
	
	public static int computeKuaNumber(int year, int gender) {
		//System.out.println("Year = " + year + ", gender = " + gender);
		String stringRepresentation = "" + year;
		char[] chars = stringRepresentation.toCharArray();
		int digit1 = Integer.parseInt(String.valueOf(chars[2]));
		//System.out.println("digit 1 = " + digit1);
		int digit2 = Integer.parseInt(String.valueOf(chars[3]));
		//System.out.println("digit 2 = " + digit2);
		int kuaNumber = digit1 + digit2;
		//System.out.println("so far kua number = " + kuaNumber);
		if(kuaNumber > 9) {
			stringRepresentation = "" + kuaNumber;
			chars = stringRepresentation.toCharArray();
			digit1 = Integer.parseInt(String.valueOf(chars[0]));
			digit2 = Integer.parseInt(String.valueOf(chars[1]));
			kuaNumber = digit1 + digit2;
			//System.out.println("and now we have " + kuaNumber);
		}
		if(gender == 1) {
			//female
			if(year < 2000) {
				kuaNumber += 5;
			}
			else if(year == 2000) {
				kuaNumber = -1;
			}
			else {
				kuaNumber += 6;
			}
			if(kuaNumber > 9) {
				stringRepresentation = "" + kuaNumber;
				chars = stringRepresentation.toCharArray();
				digit1 = Integer.parseInt(String.valueOf(chars[0]));
				digit2 = Integer.parseInt(String.valueOf(chars[1]));
				kuaNumber = digit1 + digit2;
			}
		}
		else if(gender == 2) {
			if(year == 2009 || year == 2018) {
				kuaNumber = 9;
			}
			else if(year < 2000) {
				kuaNumber = 10 - kuaNumber;
			}
			else if(year == 2000) {
				kuaNumber = -1;
			}
			else {
				kuaNumber = 9 - kuaNumber;
			}
		}
		return kuaNumber;
	}
}
