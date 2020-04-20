function empezar() {
	let arrayCiudades = introducirCiudades();
	arrayCiudades.sort();
	let arrayCiudadesModificadas = foursForAs(arrayCiudades);
	document.getElementById("display").innerHTML = arrayCiudadesModificadas;
	
}


function introducirCiudades() {
	let arrayCiudades = []
	for (let i = 0; i < 6; i++) {
		let ciudad = prompt("introduzca ciudad:");
		arrayCiudades.push(ciudad);
	}
	return arrayCiudades;
}

function foursForAs(arrayCiudades) {
	let arrayCiudadesModificadas = [];
	for (let i = 0; i < arrayCiudades.length; i++) {
		var ciudad = arrayCiudades[i]
		var nuevaCiudad = "";
		for (let j = 0; j < ciudad.length; j++) {
			if (ciudad[j] == "a") {
				nuevaCiudad += "4";
			} else {
				nuevaCiudad += ciudad[j];
			}
		}
		arrayCiudadesModificadas.push(nuevaCiudad);
	}
	return arrayCiudadesModificadas;
}
