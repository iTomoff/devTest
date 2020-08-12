package com.desarrollo.test.caracteristica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CaracteristicaService {
	
	@Autowired 
	private CaracteristicaRepository caracteristicaRepository;

	
	public List<Caracteristica> getAllCaracteristicas() {
	
		List<Caracteristica> caracteristicas = new ArrayList<>();
		
		caracteristicaRepository.findAll()
		.forEach(caracteristicas::add);
		
		return caracteristicas;
	}
		
	public Optional<Caracteristica> getCaracteristicas(Integer id) {
		return caracteristicaRepository.findById(id);
	}

	public void addCaracteristica(Caracteristica caracteristica) {
		caracteristicaRepository.save(caracteristica);
	}

	public void updateCaracteristica(Integer id, Caracteristica caracteristica) {
		caracteristicaRepository.save(caracteristica);
	}
	
	public void deleteCaracteristica(Integer id) {
		caracteristicaRepository.deleteById(id);	
	}

}
