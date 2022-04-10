package com.LockedME;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HandleOptions {
	public static void handleWelocomeScreen() {
		
		Scanner sc=new Scanner(System.in);
		String arr[]={"index.html","module.js","configurator.js","styles.css"};
		
		ArrayList<String> files = new ArrayList<>();
		boolean running = true;
		for(String i : arr) {
			files.add(i);
		}
		
		do {
			try {
				//MenuOptions.primaryMenu();
				int input=sc.nextInt();
				switch(input) {
				case 1:
					if(files.size()>0) {
						Collections.sort(files);
						System.out.println(files);
					}
					else {
						System.out.println("No files Found");
					}
					break;
				case 2:
					System.out.println("\n 1.Add File \n"+"\n 2.Delete File \n"+" \n 3.Search File \n"+"\n 4.GO to Menu \n"+"\n 5.Close the application \n");
					int n=sc.nextInt();
					if(n==1) {
						System.out.println("Enter File to be added");
						files.add(sc.next());
						
					}
					else if(n==2) {
						System.out.println("Enter file to be deleted");
						String str=sc.next();
						if(files.contains(str)) {
							files.remove(str);
						}
						else {
							System.out.println("File not Found");
						}
					}
					else if(n==3) {
						System.out.println("Enter File to be searched");
						String z=sc.next();
						
						if(files.contains(z)) {
							System.out.println("File Exist at position:"+files.indexOf(z));
						}
						else {
							System.out.println("File doesn't Exist");
						}
					}
					else if(n==4) {
						MenuOptions.primaryMenu();
					}
					else
					{
						System.out.println("Enter the valid option");
					}
					//HandleOptions.handleSecondaryMenu();
					break;
				case 3:
					System.out.println("Program exited Successfully");
					running=false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option");
					
				}
			}
			catch(Exception e) {
				System.out.println(e.getClass().getName());
				handleWelocomeScreen();
			}
		}
		while(running == true);
		
	}
	/*public static void handleSecondaryMenu() {
		boolean running = true;
		Scanner sc=new Scanner(System.in);
		do {
			try {
				MenuOptions.secondaryMenu();
				int input=sc.nextInt();
				switch(input) {
				case 1:
					System.out.println("Enter the name of the file to be added");
					
					//FileOperations.createFile
					break;
				case 2:
					System.out.println("Enther the name of the file to be deleted");
					String fileToDelete=sc.next();
					//write a function to delete folder
					break;
				case 3:
					System.out.println("Enter the name of the files to be Serached");
					String fileName = sc.next();
					break;
				case 4:
					return;
				case 5:
					System.out.println("Program exited Successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select valid option from above");
					
				}
			}
			catch(Exception e) {
				System.out.println(e.getClass().getName());
				handleSecondaryMenu();
			}
		}
		while(running == true);
	}
	*/

}
