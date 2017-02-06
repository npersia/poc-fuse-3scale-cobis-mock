package com.semperti.hipotecario.poc.cobis;

import java.io.Serializable;

import java.util.List;
import java.util.ArrayList;

public class Persona implements Serializable {
	int idNumeroDocumento;
	int numeroDocumento;
	int idSexo;
	int id;
	String apellidos;
	String nombres;
	boolean esPersonaFisica;
	boolean esPersonaJuridica;
	List<PrestamoPatrimonial> prestamosPatrimoniales;
	List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimoniales;

	public Persona() {}

	public Persona(int idNumeroDocumento, int numeroDocumento, int idSexo, int id, String apellidos, String nombres, boolean esPersonaFisica, boolean esPersonaJuridica) {
		setIdNumeroDocumento(idNumeroDocumento);
		setNumeroDocumento(numeroDocumento);
		setIdSexo(idSexo);
		setId(id);
		setApellidos(apellidos);
		setNombres(nombres);
		setEsPersonaFisica(esPersonaFisica);
		setEsPersonaJuridica(esPersonaJuridica);
	}

	public int getIdNumeroDocumento() {
		return idNumeroDocumento;
	}

	public void setIdNumeroDocumento(int id) {
		this.idNumeroDocumento = id;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public int getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(int id) {
		this.idSexo = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public boolean getEsPersonaFisica() {
		return esPersonaFisica;
	}

	public void setEsPersonaFisica(boolean esPersonaFisica) {
		this.esPersonaFisica = esPersonaFisica;
	}

	public boolean getEsPersonaJuridica() {
		return esPersonaJuridica;
	}

	public void setEsPersonaJuridica(boolean esPersonaJuridica) {
		this.esPersonaJuridica = esPersonaJuridica;
	}

	public List<PrestamoPatrimonial> getPrestamosPatrimoniales() {
		return prestamosPatrimoniales;
	}

	public void setPrestamosPatrimoniales(List<PrestamoPatrimonial> prestamosPatrimoniales) {
		this.prestamosPatrimoniales = prestamosPatrimoniales;
	}

	public List<TarjetaCreditoPatrimonial> getTarjetasCreditoPatrimoniales() {
		return tarjetasCreditoPatrimoniales;
	}

	public void setTarjetasCreditoPatrimoniales(List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimoniales) {
		this.tarjetasCreditoPatrimoniales = tarjetasCreditoPatrimoniales;
	}
}
