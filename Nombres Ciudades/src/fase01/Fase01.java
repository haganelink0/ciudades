package fase01;

import java.util.Scanner;

public class Fase01 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String ciudad1;
		String ciudad2;
		String ciudad3;
		String ciudad4;
		String ciudad5;
		String ciudad6;
		
		System.out.println("introduzca Barcelona");
		ciudad1 = userInput.nextLine();
		System.out.println("introduzca Madrid");
		ciudad2 = userInput.nextLine();
		System.out.println("introduzca Valencia");
		ciudad3 = userInput.nextLine();
		System.out.println("introduzca Malaga");
		ciudad4 = userInput.nextLine();
		System.out.println("introduzca Cadis");
		ciudad5 = userInput.nextLine();
		System.out.println("introduzca Santander");
		ciudad6 = userInput.nextLine();
		userInput.close();
		System.out.println(ciudad1 + " " + ciudad2 + " " + ciudad3 + " " + ciudad4 + " " + ciudad5 + " " + ciudad6);
		

	}

}
