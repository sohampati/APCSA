import java.util.Scanner;

public class CountingChar {

	public static void main(String[] args) 
	{
	
		
		Scanner scan = new Scanner(System.in);
		
		// Print a program header
		System.out.println();
		System.out.println("Character Counter");
		System.out.println();
		
		// Read in a string and find its length
		String phrase = "";
		while(!phrase.equals("quit")){
			
			int countBlank, countA, countE, countS, countT;
			int length;
			char ch;
			System.out.print("Enter a sentence or phrase: ");
			phrase = scan.nextLine();
			System.out.println("Type \"quit\" to exit the program");
		
			length = phrase.length();
		
		// Initialize counts
		countBlank = 0;
		countA = 0;
		countE = 0;
		countS = 0;
		countT = 0;
		
		// a for loop to go through the string char by char
		// and count the blank spaces
		
			for(int i = 0; i < length; i++){
				ch = phrase.charAt(i);
	
				if(ch == ' '){
					countBlank++;
				}
				if(ch == 's' || ch == 'S'){
					countS++;
				}
				if(ch == 'a' || ch == 'A'){
					countA++;
				}
				if(ch == 'e' || ch == 'E'){
					countE++;
				}
				if(ch == 't' || ch == 'T'){
					countT++;
				}
		
			}
			System.out.println("Number of s letters: " + countS);
		System.out.println("Number of blank spaces: " + countBlank);
		System.out.println("Number of a letters: " + countA);	
		System.out.println("Number of e letters: " + countE);
		System.out.println("Number of t letters: " + countT);
		
		}
		

		// Print the results
		
		
	}

		}
		

