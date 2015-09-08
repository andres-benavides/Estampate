$(document).ready(function(){
  //FORMULARIO PARA GUARDAR EMPLEADO
  $("#registro").validate({
    rules: {
        nombre:{required: true},
        apellido:{required: true},
        direccion:{required: true},
        cedula:{required: true,digits: true,maxlength: 10},
        celular:{required: true,digits: true,maxlength: 10},
        usuario:{required: true},
        password:{required: true}
      },messages:{
        nombre:{required: "Campo Obligatorio"},
        apellido:{required: "Campo Obligatorio"},
        direccion:{required: "Campo Obligatorio"},
        cedula:{required: "Campo Obligatorio",number: "Ingrese solo numeros",maxlength:"Maximo 10 caracteres"},
        cedcelularula:{required: "Campo Obligatorio",number: "Ingrese solo numeros",maxlength:"Maximo 10 caracteres"},
        usuario:{required: "Campo Obligatorio"},
        password:{required: "Campo Obligatorio"}
      }
  });
  //BUSCAR EMPLEADO PARA EDITAR
  $("#formEdit").validate({
    rules: {
        buscaEmp: {required: true,digits: true}
      },messages:{
        buscaEmp: {required: "Ingrese la Cedula del Empleado",digits: "Ingrese solo numeros"}
      }
  });
  //GUARDAR VARIABLES
  $("#guardarVariables").validate({
    rules: {
        SMMLV: {number: true,min:0},
        interes: {number: true,max: 1,min:0}
      },messages:{
        SMMLV: {digits: "Ingrese solo numeros",min:"Este campo debe ser positivo"},
        interes: {digits: "Ingrese solo numeros",max:"La taza de interes no puede superar 1 que equivale al 100%",min:"Este campo debe ser positivo"}
      }
  });
  //GUARDAR TOPES
  $("#guardarTope").validate({
    rules: {
        admin: {digits: true,min:0},
        opera: {digits: true,min:0},
        direc: {digits: true,min:0}
      },messages:{
        admin: {digits: "Ingrese solo numeros",min:"Este campo debe ser positivo"},
        opera: {digits: "Ingrese solo numeros",min:"Este campo debe ser positivo"},
        direc: {digits: "Ingrese solo numeros",min:"Este campo debe ser positivo"}
      }
  });
  //CALCULAR CUOTAS
  $("#prestamo").validate({
    rules: {
        valorSolicitar: {digits: true},
   
      },messages:{
        admin: {digits: "Ingrese solo numeros"},
        opera: {digits: "Ingrese solo numeros"},
        direc: {digits: "Ingrese solo numeros"}
      }
  });
});
