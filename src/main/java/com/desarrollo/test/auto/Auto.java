package com.desarrollo.test.auto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.desarrollo.test.tipo.Tipo;


@Entity
@Table(name = "auto")
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Tipo tipo;

	private boolean AA;

	private boolean AB;

	private boolean TC;

	private boolean ABS;

	private boolean LL;
	private Integer precio;


	public Auto(Tipo tipo, boolean aA, boolean aB, boolean tC, boolean aBS, boolean lL) {
		super();
		this.tipo = tipo;
		AA = aA;
		AB = aB;
		TC = tC;
		ABS = aBS;
		LL = lL;
	}

	public Auto() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Boolean getAA() {
		return AA;
	}

	public void setAA(Boolean aA) {
		AA = aA;
	}

	public Boolean getAB() {
		return AB;
	}

	public void setAB(Boolean aB) {
		AB = aB;
	}

	public Boolean getTC() {
		return TC;
	}

	public void setTC(Boolean tC) {
		TC = tC;
	}

	public Boolean getABS() {
		return ABS;
	}

	public void setABS(Boolean aBS) {
		ABS = aBS;
	}

	public Boolean getLL() {
		return LL;
	}

	public void setLL(Boolean lL) {
		LL = lL;
	}

	
}
