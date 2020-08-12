package com.desarrollo.test.auto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AutoController {

	@Autowired
	private AutoService autoService;
	
	@RequestMapping(value="/autos")
	public List<Auto> getAllAutos(){
		return autoService.getAllAutos();
	}
	
	@RequestMapping(value="/stats")
	public List<Auto> getStats(){
		return autoService.getStats();
	}
	
	@RequestMapping(value = "/autos/{id}")
	public Optional <Auto> getAuto(@PathVariable Integer id) {
		return autoService.getAuto(id);
	}
	
	@RequestMapping(value = "/autos", method=RequestMethod.POST)
	public void addAuto(@RequestBody Auto auto) {
		 autoService.addAuto(auto);
	}
	
	@RequestMapping(value ="/autos/{id}", method = RequestMethod.PUT)
	public void updateAuto(@RequestBody Auto auto, @PathVariable Integer id) {
		autoService.updateAuto(id, auto);
	}

	@RequestMapping(value = "/autos/{id}", method = RequestMethod.DELETE)
	 public void deleteAuto(@PathVariable Integer id) {
	      autoService.deleteAuto(id);
	 }
	
	
}


