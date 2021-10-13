$(document).ready(function() {
	alert("json");
		$('.cargaclientes').on('click', function(){
		alert("clic en el boton");
		consultarclientes();
		});
	function consultarclientes(){
	$.ajax({
		url: "ServletReportes",
		type: "POST",
		dataType: "JSON",

		success: function(result) {
			console.log(result);
			let tabla=document.querySelector('#tab');
			console.log(tabla);
			tabla.innerHTML = "";
			tabla.innerHTML = `<tr><th>Cedula</th>
								<th>Dirección</th>
								<th>Email</th>
								<th>Nombre</th>
								<th>Teléfono</th>
			</tr>`;
			//recorrer el objeto result
			//+= permite concatenar sumando una fila más
			//se coloca el identificar de pesos para que reconozca el dato que se trae en el JSON
			//se coloca codigolinea tal cual cómo esta en DTO.
			for (let i of result) {
				tabla.innerHTML += `<tr><td>${i.cedula_cliente}</td>
				<td>${i.direccion_cliente}</td>
				<td>${i.email_cliente}</td>
				<td>${i.nombre_cliente}</td>
				<td>${i.telefono_cliente}</td>
				</tr>`;

			} 
		}
	});
}
});