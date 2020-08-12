# devTest

Programa que permite mostrar, quitar, actualizar y agregar automóviles. Siendo estos agregados en una base de datos adjunta H2
La lista de automóviles se encuentra vacía por lo que hay que agregar automóviles teniendo en cuenta su tipo y las caracteristicas que posee señalando con True o False
dependiendo sea el caso de la caracteristica.


getAllAutos = muestra la lista de autos existente

getAuto = recibe como parámetro un Id de tipo entero, y muestra el auto con el id deseado

addAuto = agrega un auto a la base de datos teniendo en cuenta todas las caracteristicas del mismo, calculando a su vez el valor final del automóvil

updateAuto = actualiza un auto ya existente teniendo en cuenta un Id

deleteAuto = borra un automovil teniendo en cuenta un Id

------------------------------------

Se pueden agregar, eliminar, o listar los Tipos de autos con los siguientes metodos

getAllTipos = muestra todos los tipos de autos disponibles

getTipo = recibiendo un Id como parametro, muestra el tipo de vehiculo que contiene dicho Id

updateTipo = actualiza un Tipo ya existente teniendo en cuenta un id pasado por parametro

deleteTipo = elimina un Tipo teniendo en cuenta un Id

------------------------------------

Se pueden agregar, eliminar, o listar las caracteristicas de los autos con los siguientes metodos

getAllCaracteristicas = muestra todas las caracteristicas disponibles

getCaracteristica = recibiendo un Id como parametro, muestra la caracteristica que contiene dicho Id

updateCaracteristica = actualiza una caracteristica ya existente teniendo en cuenta un id pasado por parametro

deleteCaracteristica = elimina una caracteristica teniendo en cuenta un Id
