package com.desarrollo.test.tipo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TipoController {

	@Autowired
	private TipoService tipoService;
	
	@RequestMapping(value="/tipos")
	public List<Tipo> getAllTipos(){
		return tipoService.getAllTipos();
	}
	
	@RequestMapping(value = "/tipos/{id}")
	public Optional <Tipo> getTipo(@PathVariable Integer id) {
		return tipoService.getTipo(id);
	}
	
	@RequestMapping(value = "/tipos", method=RequestMethod.POST)
	public void addTipo(@RequestBody Tipo tipo) {
		tipoService.addTipo(tipo);
	}
	
	@RequestMapping(value ="/tipos/{id}", method = RequestMethod.PUT)
	public void updateTipo(@RequestBody Tipo tipo, @PathVariable Integer id) {
		tipoService.updateTipo(id, tipo);
	}

	@RequestMapping(value = "/tipos/{id}", method = RequestMethod.DELETE)
	 public void deleteTipo(@PathVariable Integer id) {
		tipoService.deleteTipo(id);
	 }
}
	
