//z autores Luis Diego Jimenez Delgado y Alejandro Rangel Mendez
//grupo 5Im6
//fecha 29 de agosto del 2017
//Se llama al serverlet y se compara su respuesta
function login(){
    var email = document.getElementById("email");
    var password = document.getElementById("password");
    //request xml del serverlet

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var res = this.responseText;
         //reviso el contenido de mensaje 
            if (res === "1") {
                 alert("Entraste");
            }
            else {
                alert("Incorrecto"); 
            }
       }
    };
    xhttp.open("GET", "Email?email="+email.value+"&password="+password.value, true);
    xhttp.send(); 
}