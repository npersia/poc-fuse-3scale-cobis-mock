package com.semperti.hipotecario.poc.cobis;

import java.io.Serializable;

public class PrestamoPatrimonial implements Serializable {
	private int id;
	private int idTipoPrestamo;
	private int idEntidad;
	private float deuda;
	private int plazoRestante;
	private float valorCuota;
	private boolean esACancelar;
	private int idPersona;

	public PrestamoPatrimonial() {}

	public PrestamoPatrimonial(int id, int idTipoPrestamo, int idEntidad, float deuda, int plazoRestante, float valorCuota, boolean esACancelar, int idPersona) {
		setId(id);
		setIdTipoPrestamo(idTipoPrestamo);
		setIdEntidad(idEntidad);
		setDeuda(deuda);
		setPlazoRestante(plazoRestante);
		setValorCuota(valorCuota);
		setEsACancelar(esACancelar);
		setIdPersona(idPersona);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdTipoPrestamo() {
		return idTipoPrestamo;
	}

	public void setIdTipoPrestamo(int idTipoPrestamo) {
		this.idTipoPrestamo = idTipoPrestamo;
	}

	public int getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public float getDeuda() {
		return deuda;
	}

	public void setDeuda(float deuda) {
		this.deuda = deuda;
	}

	public int getPlazoRestante() {
		return plazoRestante;
	}

	public void setPlazoRestante(int plazoRestante) {
		this.plazoRestante = plazoRestante;
	}

	public float getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(float valorCuota) {
		this.valorCuota = valorCuota;
	}

	public boolean getEsACancelar() {
		return esACancelar;
	}

	public void setEsACancelar(boolean esACancelar) {
		this.esACancelar = esACancelar;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
}
