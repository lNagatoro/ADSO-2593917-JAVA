let tbodyPersonas = document.getElementById("tbodyPersonas");
let listaPersonas = null;
let formularioCrarUsuario = document.getElementById("formularioCrarUsuario");
let formEditarUsuario = document.getElementById("formEditarUsuario");
let formEliminarUsuario = document.getElementById("formEliminarUsuario");

formEliminarUsuario.addEventListener("submit", function (event) {
	event.preventDefault();
	confirmarEliminacion();
});

formEditarUsuario.addEventListener("submit", function (event) {
	event.preventDefault();
	guardarEdicionUsuario();
  });

formularioCrarUsuario.addEventListener("submit", function(event){
	event.preventDefault();
	registrarUsuario();
});

function base_url(texto){
	return "http://localhost/Nuevoads/index.php/"+texto;
}

function registrarUsuario() {
	let datos = new FormData (formularioCrarUsuario);
	let configuracion = {
							method: "POST",
							headers: {"Accept": "application/json"},
							body: datos,

						};
	fetch( base_url('admin/usuario/insertarUsuario'), configuracion)
	.then(resp => resp.json())
	.then( data => {
		if(data.status && data.message=="OK##INSERT"){
			Swal.fire({
				title: 'USUARIO INSERTADO',
				icon: 'success',
				text: 'Se a creado con exito el usuario, puede ingresar al sistema',
				confirmButtonText: 'ENTENDIDO',
				colorButtonText: '#A10000',
			});
			
			cargarPersonas();
		}
		
		if(data.status && data.message=="ERROR##DUPLICADO"){
			Swal.fire({
				title: 'ERROR DATOS DUPLICADOS',
				icon: 'success',
				text: 'Es posible que la cedula o el email se encuentren registrados en el sistema',
				confirmButtonText: 'ENTENDIDO',
				colorButtonText: '#A10000',
			});
		}

		if(data.status && data.message=="ERRORDATOS##VACIOS"){
			Swal.fire({
				title: 'ERROR DATOS VACIOS',
				icon: 'success',
				text: 'Es posible que algun datos se encuentre vacio, es nesesario que todos los campos esten llenos',
				confirmButtonText: 'ENTENDIDO',
				colorButtonText: '#A10000',
			});
		}
	});


					
}

function cargarPersonas(){
	fetch( base_url("admin/Usuario/getListaUsuarios") )
	.then( res => res.json() )
	.then( data => {
		
		listaPersonas = data;
		tbodyPersonas.innerHTML = "";
		for (let i = 0; i < data.length; i++) {
			html_tr = `
						<tr class="">
				            <td>${ data[i].cedula }</td>
							<td>${ data[i].nombres }</td>
				            <td>${ data[i].apellidos }</td>
							<td>${ data[i].telefono }</td>
				            <td>${ data[i].direccion }</td>
				            <td>${ data[i].email }</td>
				            <td>
				            	<button class="btn btn-primary" onclick="abrirModalEditar(${i})" >
				            		Editar
				            	</button>
							</td>
							<td>
				            	<button class="btn btn-danger" onclick="abrirModalEliminar(${i})">
				            		Eliminar
				            	</button>
				            </td>
				        </tr>
					  `;
			tbodyPersonas.innerHTML += html_tr;
		}
		
	});
	
}

function abrirModalEditar(indice){
	
	const usuario = listaPersonas[indice];

	document.getElementById("editarCedula").value = usuario.cedula;
	document.getElementById("editarNombre").value = usuario.nombres;
	document.getElementById("editarApellido").value = usuario.apellidos;
	document.getElementById("editarTelefono").value = usuario.telefono;
	document.getElementById("editarDireccion").value = usuario.direccion;
	document.getElementById("editarEmail").value = usuario.email;

	
	

	
	$('#editarUsuarioModal').modal('show');
	

}

function guardarEdicionUsuario() {
	let datos = new FormData(formEditarUsuario);
	let configuracion = {
		method: "POST",
		headers: { "Accept": "application/json" },
		body: datos,
	};

	fetch(base_url("admin/usuario/actualizarUsuario"), configuracion)
		.then(respt => respt.json())
		.then(data => {
		if (data.status && data.message === "OK##UPDATE") {
			Swal.fire({
				title: 'Error al actualizar usuario',
				icon: 'error',
				text: 'Hubo un error al actualizar al usuario. Por favor, inténtalo nuevamente.',
				confirmButtonText: 'Entendido',
				colorButtonText: '#A10000',
			});
		} else {
			Swal.fire({
			title: 'Usuario Actualizado',
			icon: 'success',
			text: 'Los cambios se han guardado correctamente.',
			confirmButtonText: 'Entendido',
			colorButtonText: '#A10000',
			});

			
			$('#editarUsuarioModal').modal('hide');
			window.location.reload();
		
			cargarPersonas();
			
		}
		});
	
}

function abrirModalEliminar(indice){
	
	const usuario = listaPersonas[indice];

	document.getElementById("eliminarCedulas").value = usuario.cedula;
	document.getElementById("eliminarNombres").value = usuario.nombres;
	document.getElementById("eliminarApellidos").value = usuario.apellidos;
	document.getElementById("eliminarTelefonos").value = usuario.telefono;
	document.getElementById("eliminarDireccions").value = usuario.direccion;
	document.getElementById("eliminarEmails").value = usuario.email;
	
		
	$("#elimarUsuarioModal").modal('show');
	
	

}

function confirmarEliminacion() {
		let datos = new FormData(formEliminarUsuario);

		let configuracion = {
			method: "POST",
			headers: { "Accept": "application/json" },
			body: datos,
			dataType: "json",
		};
		fetch(base_url('admin/Usuario/eliminarUsuarios'), configuracion) 
			.then((resp) => resp.json())
			.then((data) => {
				if (data.status && data.message === 'OK##DELETE') {
					Swal.fire({
						title: 'Error al eliminar usuario',
						icon: 'error',
						text: 'Hubo un error al eliminar al usuario. Por favor, inténtalo nuevamente.',
						confirmButtonText: 'Entendido',
						colorButtonText: '#A10000',
					});
				} else {
					Swal.fire({
					title: 'Usuario Eliminado',
					icon: 'success',
					text: 'El usuario ha sido eliminado correctamente.',
					confirmButtonText: 'Entendido',
					colorButtonText: '#A10000',
					});
					$('#eliminarUsuarioModal').modal('hide');
	
					window.location.reload();
					cargarPersonas();	   
				
				}
		});
    
}






cargarPersonas();