function empezar() {
	//creación de variables
	let barcelona = "barcelona";
	let madrid = "madrid";
	let valencia = "valencia";
	let malaga = "malaga";
	let cadis = "cadis";
	let santander = "santander";
	
	//creación de arrays
	barcelonaArray = [barcelona.length];
	madridArray = [madrid.length];
	valenciaArray = [madrid.length];
	malagaArray = [malaga.length];
	cadisArray = [cadis.length];
	santanderArray = [santander.length];
	
	//función para rellenar los arrays
	rellenArray(barcelonaArray, barcelona);
	rellenArray(madridArray, madrid);
	rellenArray(valenciaArray, valencia);
	rellenArray(malagaArray, malaga);
	rellenArray(cadisArray, cadis);
	rellenArray(santanderArray, santander);
	
	//función para imprimir los nombres del derecho y el revés
	imprimirDelReves(barcelonaArray, barcelona);
	imprimirDelReves(madridArray, madrid);
	imprimirDelReves(valenciaArray, valencia);
	imprimirDelReves(malagaArray, malaga);
	imprimirDelReves(cadisArray, cadis);
	imprimirDelReves(santanderArray, santander);
}

function rellenArray(array, ciudad) {
	for (let i = 0; i < ciudad.length; i ++) {
		array[i] = ciudad[i];
	}
}

function imprimirDelReves(array, ciudad) {
	let display = document.getElementById("display");
	display.innerHTML += ciudad + " - ";
	for (let i = 1; i <= array.length; i++) {
		display.innerHTML += array[array.length - i];
	}
	display.innerHTML += "<br>";
}