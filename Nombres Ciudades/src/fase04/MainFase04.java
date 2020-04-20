package fase04;

public class MainFase04 {

	public static void main(String[] args) {
		//creación String ciudades
		String barcelona = "barcelona";
		String madrid = "madrid";
		String valencia = "valencia";
		String malaga = "malaga";
		String cadis = "cadis";
		String santander = "santander";
		
		//creación arrays de las ciudades
		char barcelonaArray [] = new char[barcelona.length()];
		char madridArray [] = new char[madrid.length()];
		char valenciaArray [] = new char[valencia.length()];
		char malagaArray [] = new char[malaga.length()];
		char cadisArray [] = new char[cadis.length()];
		char santanderArray [] = new char[santander.length()];
		
		//método para llenar los arrays con los chars de los strings
		fulfillArray(barcelonaArray, barcelona);
		fulfillArray(madridArray, madrid);
		fulfillArray(valenciaArray, valencia);
		fulfillArray(malagaArray, malaga);
		fulfillArray(cadisArray, cadis);
		fulfillArray(santanderArray, santander);
		
		//método para imprimir los nombres al revés.
		reversePrint(barcelonaArray, barcelona);
		reversePrint(madridArray, madrid);
		reversePrint(valenciaArray, valencia);
		reversePrint(malagaArray, malaga);
		reversePrint(cadisArray, cadis);
		reversePrint(santanderArray, santander);
		

	}
	
	public static void fulfillArray(char cityArray [], String city) {
		for (int i = 0; i < city.length(); i++) {
			cityArray [i] = city.charAt(i);
		}
	
	}
	
	public static void reversePrint(char cityArray[], String city) {
		System.out.print(city + " - ");
		for (int i = 1; i <= cityArray.length; i++) {
			System.out.print(cityArray[cityArray.length - i]);
		}
		System.out.println("\n");
	}

}
