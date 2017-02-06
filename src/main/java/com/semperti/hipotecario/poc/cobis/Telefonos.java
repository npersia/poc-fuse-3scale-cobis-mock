package com.semperti.hipotecario.poc.cobis;

import java.util.List;
import java.util.ArrayList;

import java.io.Serializable;

public class Telefonos implements Serializable {
	protected List<Telefono> telefonos = new ArrayList<Telefono>();
	public Telefonos() {}

	public Telefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
}
