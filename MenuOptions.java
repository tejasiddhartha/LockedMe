package com.LockedME;

public class MenuOptions {
	public static void printScreen() {
		System.out.println("Welcome To LockedMe.com." + "This applocation is developed by Siddhartha Alwala.");
		
	}
	public static void primaryMenu() {
		String menu="\nSelect any option from below and press Enter\n"+" \n 1)Retrieve all files \n"+"\n 2)Display menu for File operation \n "+"\n 3)Close the Application \n";
		System.out.println(menu);
		HandleOptions.handleWelocomeScreen();
	}
	/*public static void secondaryMenu() {
		String fileOperations="\n Select any option from below and press Enter \n" + "\n Add a file to main folder \n" + "\n Delete a file from main folder \n" + "\n Search for a file file from main folder \n" + "\n Go to previous menu \n" + "\n Exit Program \n";
		System.out.println(fileOperations);
	}*/
}
