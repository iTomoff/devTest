package com.desarrollo.test.auto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;

import com.desarrollo.test.tipo.Tipo;

class AutoServiceTest {
	@InjectMocks
	AutoService autoService;

	@InjectMocks
	Auto auto;

	@InjectMocks
	Tipo tipo;
	
	@Mock
	AutoRepository autoRepository;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void getAllAutosTest() {
		Tipo tipo = new Tipo();

		tipo.setId(1);
		tipo.setNombre("Test");
		tipo.setPrecio(10000);

		when(autoRepository.findAll()).thenReturn(Stream
				.of(new Auto(tipo, true, false, true, false, true), new Auto(tipo, false, true, false, true, false))
				.collect(Collectors.toList()));

		assertEquals(2, autoService.getAllAutos().size());

	}

	@Test
	public void getStatsTest() {
		Tipo tipo = new Tipo();

		tipo.setId(1);
		tipo.setNombre("Test");
		tipo.setPrecio(10000);

		when(autoRepository.findAll()).thenReturn(Stream
				.of(new Auto(tipo, true, false, true, false, true), new Auto(tipo, false, true, false, true, false))
				.collect(Collectors.toList()));

		assertEquals(2, autoService.getStats().size());

	}
	
	@Test
	void getAutoTest() {

		Tipo tipo = new Tipo();
		Optional<Auto> auto = Optional.of(new Auto());

		tipo.setId(1);
		tipo.setNombre("Test");
		tipo.setPrecio(10000);

		auto.get().setAA(true);
		auto.get().setAB(false);
		auto.get().setABS(true);
		auto.get().setLL(true);
		auto.get().setTC(true);
		auto.get().setPrecio(50000);
		auto.get().setTipo(tipo);
		auto.get().setId(1);

		when(autoRepository.findById(anyInt())).thenReturn(auto);
		Optional<Auto> auto1 = autoService.getAuto(1);
		assertNotNull(auto1);

		verify(autoRepository).findById(auto1.get().getId());
	}

	@Test
	public void testAddAuto() {

		Tipo tipo = new Tipo();
		auto = new Auto(tipo, true, true, false, true, true);

		tipo.setId(1);
		tipo.setNombre("Test");
		tipo.setPrecio(10000);

		when(autoRepository.save(auto)).thenReturn(auto);

		autoRepository.save(auto);
		assertNotNull(auto.getAA());
		assertNotNull(auto.getAB());
		assertNotNull(auto.getABS());
		assertNotNull(auto.getLL());
		assertNotNull(auto.getTC());
		assertNotNull(auto.getTipo());

		verify(autoRepository).save(auto);
	}


	@Test 
	
	public void deleteAutoTest() {
		
		auto = new Auto(tipo, true, false, true, false, false);
		auto.setId(1);
		autoService.deleteAuto(auto.getId());
		verify(autoRepository, times(1)).deleteById(auto.getId());
		
	}
	

}
