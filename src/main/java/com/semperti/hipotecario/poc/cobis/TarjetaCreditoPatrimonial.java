package com.semperti.hipotecario.poc.cobis;

import java.io.Serializable;

public class TarjetaCreditoPatrimonial implements Serializable {
	private int id;
	private int idMarcaTCPatrimonial;
	private int idEntidad;
	private float limiteCompra;
	private float deuda;
	private float pagoPromedio;
	private int idPersona;

	public TarjetaCreditoPatrimonial() {}
	public TarjetaCreditoPatrimonial(int id, int idMarcaTCPatrimonial, int idEntidad, float limiteCompra, float deuda, float pagoPromedio, int idPersona) {
		setId(id);
		setIdMarcaTCPatrimonial(idMarcaTCPatrimonial);
		setIdEntidad(idEntidad);
		setLimiteCompra(limiteCompra);
		setDeuda(deuda);
		setPagoPromedio(pagoPromedio);
		setIdPersona(idPersona);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdMarcaTCPatrimonial() {
		return idMarcaTCPatrimonial;
	}

	public void setIdMarcaTCPatrimonial(int idMarcaTCPatrimonial) {
		this.idMarcaTCPatrimonial = idMarcaTCPatrimonial;
	}

	public int getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public float getLimiteCompra() {
		return limiteCompra;
	}

	public void setLimiteCompra(float limiteCompra) {
		this.limiteCompra = limiteCompra;
	}

	public float getDeuda() {
		return deuda;
	}

	public void setDeuda(float deuda) {
		this.deuda = deuda;
	}

	public float getPagoPromedio() {
		return pagoPromedio;
	}

	public void setPagoPromedio(float pagoPromedio) {
		this.pagoPromedio = pagoPromedio;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
}
