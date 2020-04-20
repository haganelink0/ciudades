package fase03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainFase03 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		List<String> arrayCiutats = new ArrayList<String>();
		List<String>arrayCiutatsModificades = new ArrayList<String>();
		//Introducción de las ciudades en un Array
		for (int i = 0; i < 6; i++) {
			System.out.println("introduzca ciudad:");
			String ciudad = userInput.nextLine();
			arrayCiutats.add(ciudad);
		}
		userInput.close();
		//Ordena las ciudades por orden alfabético
		Collections.sort(arrayCiutats);
		
		//por cada una de las ciudades del Array cambia las "a" por cuatros
		for (String city : arrayCiutats) {
			String newCity = "";
			for(int i = 0; i < city.length(); i++) {
				if (city.charAt(i) == 'a') {
					newCity += "4";
				} else {
					newCity += city.charAt(i);
				}
			}
			arrayCiutatsModificades.add(newCity);
		}
		System.out.println(arrayCiutatsModificades);

	}

}
