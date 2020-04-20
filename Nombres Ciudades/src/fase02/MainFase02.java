package fase02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainFase02 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		List<String> arrayCiutats = new ArrayList<String>();
		
		for (int i = 0; i < 6; i++) {
			System.out.println("introduzca ciudad:");
			String ciudad = userInput.nextLine();
			arrayCiutats.add(ciudad);
		}
		userInput.close();
		Collections.sort(arrayCiutats);
		System.out.println(arrayCiutats);
	
		
	}

}
