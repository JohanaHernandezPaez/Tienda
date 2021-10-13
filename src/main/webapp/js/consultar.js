$(document).ready(function() {
	alert("json");
		$('.cargausuarios').on('click', function(){
		alert("clic en el boton");
		consultarusuarios();
		});
	function consultarusuarios(){
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
								<th>Email</th>
								<th>Nombre</th>
								<th>password</th>
								<th>usuario</th>
			</tr>`;
			//recorrer el objeto result
			//+= permite concatenar sumando una fila más
			//se coloca el identificar de pesos para que reconozca el dato que se trae en el JSON
			//se coloca codigolinea tal cual cómo esta en DTO.
			for (let i of result) {
				tabla.innerHTML += `<tr><td>${i.cedula_usuario}</td>
				<td>${i.nombre_usuario}</td>
				<td>${i.email_usuario}</td>
				<td>${i.password}</td>
				<td>${i.usuario}</td>
				</tr>`;

			} 
		}
	});
}
});