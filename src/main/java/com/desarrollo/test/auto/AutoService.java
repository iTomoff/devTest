package com.desarrollo.test.auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrollo.test.caracteristica.Caracteristica;
import com.desarrollo.test.caracteristica.CaracteristicaRepository;
import com.desarrollo.test.tipo.Tipo;
import com.desarrollo.test.tipo.TipoRepository;


@Service
public class AutoService {
	
	@Autowired
	private AutoRepository autoRepository;	
	
	@Autowired 
	private TipoRepository tipoRepository;
	
	@Autowired 
	private CaracteristicaRepository caracteristicaRepository;
	
	public List<Auto> getAllAutos() {
		
		List<Auto> a = new ArrayList<>();
		autoRepository.findAll()
		.forEach(a::add);
		
		return a;
	}
	
public List<Auto> getStats() {
		
		List<Auto> autos = new ArrayList<>();
		autoRepository.findAll()
		.forEach(autos::add);
		
		return autos;
	}
	
		
	public Optional<Auto> getAuto(Integer id) {
		return autoRepository.findById(id);
	}

	public Auto addAuto(Auto auto) {
		
		int total = 0;
		List<Tipo> t = new ArrayList<>();
		for (int i = 0; i < tipoRepository.count(); i++) {
			t.add(tipoRepository.findAll().get(i));
		}
		List<Caracteristica> c = new ArrayList<>();
		for (int i = 0; i < caracteristicaRepository.count(); i++) {
			c.add(caracteristicaRepository.findAll().get(i));
		}

		if(auto.getAA()!=true && auto.getAB() != true && auto.getABS() != true && auto.getLL() != true && auto.getTC() != true) {
		
			total = auto.getTipo().getPrecio();
		
		auto.setPrecio(total);
		
		}else if (auto.getAA()==true && auto.getAB() != true && auto.getABS() != true && auto.getLL() != true && auto.getTC() != true) {
	
			total = auto.getTipo().getPrecio() + c.get(0).getPrecio();
		
		auto.setPrecio(total);
		}else if (auto.getAA()==true && auto.getAB() == true && auto.getABS() != true && auto.getLL() != true && auto.getTC() != true) {
	
			total = auto.getTipo().getPrecio() + c.get(0).getPrecio() + c.get(1).getPrecio() ;
		
		auto.setPrecio(total);
		
		}else if (auto.getAA()==true && auto.getAB() == true && auto.getABS() == true && auto.getLL() != true && auto.getTC() != true) {
	
			total = auto.getTipo().getPrecio() + c.get(0).getPrecio() + c.get(1).getPrecio() + c.get(2).getPrecio() ;
		
		auto.setPrecio(total);
		}else if (auto.getAA()==true && auto.getAB() == true && auto.getABS() == true && auto.getLL() == true && auto.getTC() != true) {
	
			total = auto.getTipo().getPrecio() + c.get(0).getPrecio() + c.get(1).getPrecio() + c.get(2).getPrecio() + c.get(3).getPrecio() ;
		
		auto.setPrecio(total);
		
		}else if (auto.getAA()==true && auto.getAB() == true && auto.getABS() == true && auto.getLL() == true && auto.getTC() == true) {
	
			total = auto.getTipo().getPrecio() + c.get(0).getPrecio() + c.get(1).getPrecio() + c.get(2).getPrecio() + c.get(3).getPrecio() + c.get(4).getPrecio();
		
		auto.setPrecio(total);
		}
		
		return autoRepository.save(auto);
		
	}

	public void updateAuto(Integer id, Auto auto) {
		autoRepository.save(auto);
	}
	
	public void deleteAuto(Integer id) {
	     autoRepository.deleteById(id);	
	}

	
	
}

