import java.util.Scanner;

public class WhatDoesTheFoxSay{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		int i;
		String sound;
		String input;
		String temp;

		for(i = 0; i < n; i++){
			input = sc.nextLine();
			
			do{
				temp = sc.nextLine();

				if(!temp.contains("fox")){
					sound = temp.substring(temp.lastIndexOf(" ")) + " ";
					System.out.println("SOUND IS " + sound);
					input = input.replaceAll(sound, " ");
					System.out.println("INPUT IS " + input + "\n");
				}


			} while(!temp.contains("fox"));
			
			input = input.trim().replaceAll("\\s+", " ");

			System.out.println(input);
		}
	}
} 