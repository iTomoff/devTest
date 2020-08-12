package com.desarrollo.test.tipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class TipoService {
	
	@Autowired 
	private TipoRepository tipoRepository;

	
	public List<Tipo> getAllTipos() {
	
		List<Tipo> tipos = new ArrayList<>();
		
		tipoRepository.findAll()
		.forEach(tipos::add);
		
		return tipos;
	}
		
	public Optional<Tipo> getTipo(Integer id) {
		return tipoRepository.findById(id);
	}

	public void addTipo(Tipo tipo) {
		tipoRepository.save(tipo);
	}

	public void updateTipo(Integer id, Tipo tipo) {
		tipoRepository.save(tipo);
	}
	
	public void deleteTipo(Integer id) {
		tipoRepository.deleteById(id);	
	}

	
	
}

