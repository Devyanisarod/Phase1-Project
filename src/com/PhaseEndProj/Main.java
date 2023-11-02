package com.PhaseEndProj;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static ArrayList<Camera> cameras = new ArrayList<>();
    public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
		Validate validate = new Validate();
		Menu menu = new Menu();

		cameras.add(new Camera(1, "Samsung   ",    "DS123  ",      5000.0f,   " Available"));
		cameras.add(new Camera(2, "sony      ",    "HD214  ",      7000.0f,   " Available"));
		cameras.add(new Camera(3, "panasonic ",    "XC     ",      1000.0f,   " Available"));
		cameras.add(new Camera(4, "Chroma    ",    "CT     ",      89000.0f,   " Available"));
		cameras.add(new Camera(5, "Canon     ",    "XPL    ",      2000.0f,   " Available"));
		cameras.add(new Camera(6, "nikon     ",    "2020   ",      24400.0f,  "Available"));


		System.out.println("+--------------------------------+");
		System.out.println("|  WELCOME TO CAMERA RENTAL APP  |");
		System.out.println("+--------------------------------+");

		while(true) {
			System.out.println("PLEASE LOGIN TO CONTINUE -");
			System.out.println("USERNAME - ");
			String username = sc.next();
			System.out.println("PASSWORD - ");
			String password = sc.next();
			boolean isValidUser = validate.validateUser(username, password);

			if(isValidUser) {
				menu.menu();
				break;
			}
			else { 
				System.out.println("YOU HAVE ENTERED WRONG CREDENTIALS!!");

			}
		}
	}
}
