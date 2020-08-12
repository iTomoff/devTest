package com.desarrollo.test.caracteristica;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CaracteristicaController {

	@Autowired
	private CaracteristicaService caracteristicaService;
	
	@RequestMapping(value="/caracteristicas")
	public List<Caracteristica> getAllCaracteristicas(){
		return caracteristicaService.getAllCaracteristicas();
	}
	
	@RequestMapping(value = "/caracteristicas/{id}")
	public Optional <Caracteristica> getCaracteristica(@PathVariable Integer id) {
		return caracteristicaService.getCaracteristicas(id);
	}
	
	@RequestMapping(value = "/caracteristicas", method=RequestMethod.POST)
	public void addCaracterostoca(@RequestBody Caracteristica caracteristica) {
		caracteristicaService.addCaracteristica(caracteristica);
	}
	
	@RequestMapping(value ="/caracteristicas/{id}", method = RequestMethod.PUT)
	public void updateCaracteristica(@RequestBody Caracteristica caracteristica, @PathVariable Integer id) {
		caracteristicaService.updateCaracteristica(id, caracteristica);
	}

	@RequestMapping(value = "/caracteristicas/{id}", method = RequestMethod.DELETE)
	 public void deleteCaracteristica(@PathVariable Integer id) {
		caracteristicaService.deleteCaracteristica(id);
	 }

}
