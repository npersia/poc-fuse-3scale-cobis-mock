package com.semperti.hipotecario.poc.cobis;

import java.io.Serializable;

public class Telefono implements Serializable {
	protected int id;
	protected int idTipoTelefono;
	protected int codigoPais;
	protected int codigoArea;
	protected int prefijo;
	protected int caracteristica;
	protected int numero;
	protected int interno;
	protected String numeroNormalizado;
	protected int idPersona;

	public Telefono() {}

	public Telefono(int id, int idTipoTelefono, int codigoPais, int codigoArea, int prefijo, int caracteristica, int numero, int interno, String numeroNormalizado, int idPersona) {
		setId(id);
		setIdTipoTelefono(idTipoTelefono);
		setCodigoPais(codigoPais);
		setCodigoArea(codigoArea);
		setPrefijo(prefijo);
		setCaracteristica(caracteristica);
		setNumero(numero);
		setInterno(interno);
		setNumeroNormalizado(numeroNormalizado);
		setIdPersona(idPersona);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdTipoTelefono() {
		return idTipoTelefono;
	}

	public void setIdTipoTelefono(int idTipoTelefono) {
		this.idTipoTelefono = idTipoTelefono;
	}

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public int getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(int codigoArea) {
		this.codigoArea = codigoArea;
	}

	public int getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}

	public int getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getInterno() {
		return interno;
	}

	public void setInterno(int interno) {
		this.interno = interno;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNumeroNormalizado() {
		return numeroNormalizado;
	}

	public void setNumeroNormalizado(String numeroNormalizado) {
		this.numeroNormalizado = numeroNormalizado;
	}
}
