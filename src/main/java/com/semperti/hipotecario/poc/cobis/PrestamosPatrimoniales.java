package com.semperti.hipotecario.poc.cobis;

import java.util.List;
import java.util.ArrayList;

import java.io.Serializable;

public class PrestamosPatrimoniales implements Serializable {
	protected List<PrestamoPatrimonial> prestamosPatrimoniales = new ArrayList<PrestamoPatrimonial>();
	public PrestamosPatrimoniales() {}

	public PrestamosPatrimoniales(List<PrestamoPatrimonial> prestamosPatrimoniales) {
		this.prestamosPatrimoniales = prestamosPatrimoniales;
	}

	public List<PrestamoPatrimonial> getPrestamosPatrimoniales() {
		return prestamosPatrimoniales;
	}

	public void setPrestamosPatrimoniales(List<PrestamoPatrimonial> prestamosPatrimoniales) {
		this.prestamosPatrimoniales = prestamosPatrimoniales;
	}
}
