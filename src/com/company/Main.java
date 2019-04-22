package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	String yes = "";
	boolean contnu =false;
		while(contnu==false){
		//int num =0;
		System.out.println("enter the number");
		int count= scan.nextInt();
		while(count >0){
		//for (int i = num; i>=5; i--) {

			if (count% 7 == 0 || count % 5 == 0)
				System.out.println(count);
			count--;
		                 }


			System.out.println("Would you like to enter another number (y/n) ");
		    scan.nextLine(); // the above scan.nextInt(); consume the scan.nextLine() that is why adding empyty scan.nextLine() resolve that
			yes = scan.nextLine();
			if (yes.equalsIgnoreCase("y"))
				contnu = false;
			else
				contnu = true;


    }

    }
}
