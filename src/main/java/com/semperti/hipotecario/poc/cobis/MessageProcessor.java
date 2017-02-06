package com.semperti.hipotecario.poc.cobis;

import java.io.IOException;

import org.apache.camel.Body;
import org.apache.camel.Header;
import org.apache.camel.Handler;
import org.apache.camel.Exchange;

import org.apache.cxf.message.MessageContentsList;

import java.util.List;
import java.util.ArrayList;

import org.apache.log4j.Logger;

public class MessageProcessor {
	private static final Logger logger = Logger.getLogger(MessageProcessor.class);

	private Personas personas;
	private Telefonos telefonos;
	private PrestamosPatrimoniales prestamosPatrimoniales;
	private TarjetasCreditoPatrimoniales tarjetasCreditoPatrimoniales;

	public MessageProcessor() {
		this.fillPersonas();
		this.fillTelefonos();
		this.fillPrestamosPatrimoniales();
		this.fillTarjetasCreditoPatrimoniales();
	}

	private void fillPersonas() {
		List<Persona> personasList = new ArrayList<Persona>();
		personasList.add(new Persona(4, 27806332, 1, 100, "Sucre", "Pedro Alfonso", true, false));
		personasList.add(new Persona(4, 30721538, 2, 24, "Steffan", "Graciela Ana", true, false));
		personasList.add(new Persona(4, 29927566, 2, 186, "Soler", "Juana M.", true, false));
		this.personas = new Personas(personasList);
	}

	private void fillTelefonos() {
		List<Telefono> telefonosList = new ArrayList<Telefono>();
		telefonosList.add(new Telefono(200, 4, 54, 11, 0, 0, 44114089, 0, "", 100));
		telefonosList.add(new Telefono(104, 4, 54, 11, 0, 0, 44432019, 0, "", 24));
		telefonosList.add(new Telefono(20, 4, 54, 0221, 0, 0, 426351, 0, "", 186));
		this.telefonos = new Telefonos(telefonosList);
	}

	private void fillPrestamosPatrimoniales() {
		List<PrestamoPatrimonial> prestamosPatrimonialesList = new ArrayList<PrestamoPatrimonial>();
		prestamosPatrimonialesList.add(new PrestamoPatrimonial(450, 3, 5, 25000, 3, 2500, true, 24));
		prestamosPatrimonialesList.add(new PrestamoPatrimonial(56, 3, 6, 75000, 6, 7500, true, 100));
		prestamosPatrimonialesList.add(new PrestamoPatrimonial(170, 3, 8, 125000, 8, 12500, true, 186));
		this.prestamosPatrimoniales = new PrestamosPatrimoniales(prestamosPatrimonialesList);

		for (Persona persona : personas.getPersonas()) {
			List<PrestamoPatrimonial> prestamos = new ArrayList<PrestamoPatrimonial>();
			for (PrestamoPatrimonial prestamo : prestamosPatrimonialesList) {
				if (prestamo.getIdPersona() == persona.getId())
					prestamos.add(prestamo);
			}

			persona.setPrestamosPatrimoniales(prestamos);
		}
	}

	private void fillTarjetasCreditoPatrimoniales() {
		List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimonialesList = new ArrayList<TarjetaCreditoPatrimonial>();
		tarjetasCreditoPatrimonialesList.add(new TarjetaCreditoPatrimonial(71, 22, 5, 5000, 25000, 2500, 24));
		tarjetasCreditoPatrimonialesList.add(new TarjetaCreditoPatrimonial(99, 10, 6, 6000, 75000, 7500, 100));
		tarjetasCreditoPatrimonialesList.add(new TarjetaCreditoPatrimonial(266, 28, 8, 9000, 125000, 12500, 186));
		tarjetasCreditoPatrimonialesList.add(new TarjetaCreditoPatrimonial(275, 28, 8, 5000, 50000, 5000, 24));
		this.tarjetasCreditoPatrimoniales = new TarjetasCreditoPatrimoniales(tarjetasCreditoPatrimonialesList);

		for (Persona persona : personas.getPersonas()) {
			List<TarjetaCreditoPatrimonial> tarjetas = new ArrayList<TarjetaCreditoPatrimonial>();
			for (TarjetaCreditoPatrimonial tarjeta : tarjetasCreditoPatrimonialesList) {
				if (tarjeta.getIdPersona() == persona.getId())
					tarjetas.add(tarjeta);
			}

			persona.setTarjetasCreditoPatrimoniales(tarjetas);
		}
	}

	@Handler
	public void process(@Header("operationName") String operation, Exchange exchange) {
		logger.info("Exchange: "+exchange);
		logger.info("Body: "+exchange.getIn().getBody());
		logger.info("Headers: "+exchange.getIn().getHeaders());
		logger.info("Operation: "+ operation);
	}

	public Personas obtenerPersonas(Exchange exchange) {
		return personas;
	}

	public Persona obtenerPersona(@Body Integer id, Exchange exchange) {
		for (Persona persona : personas.getPersonas()) {
			if (persona.getId() == id)
				return persona;
		}
		return new Persona();
	}

	public Telefonos obtenerTelefonos(Exchange exchange) {
		return telefonos;
	}

	public Telefono obtenerTelefono(@Body Integer id, Exchange exchange) {
		for (Telefono telefono : telefonos.getTelefonos()) {
			if (telefono.getId() == id)
				return telefono;
		}
		return new Telefono();
	}

	public Telefonos obtenerTelefonosDePersona(@Body Integer id, Exchange exchange) {
		List<Telefono> telefonosList = new ArrayList<Telefono>();
		for (Telefono telefono : telefonos.getTelefonos()) {
			if (telefono.getIdPersona() == id)
				telefonosList.add(telefono);
		}

		return new Telefonos(telefonosList);
	}

	public TarjetasCreditoPatrimoniales obtenerTarjetasCreditoPatrimoniales(Exchange exchange) {
		return tarjetasCreditoPatrimoniales;
	}

	public TarjetaCreditoPatrimonial obtenerTarjetaCreditoPatrimonial(@Body Integer id, Exchange exchange) {
		for (TarjetaCreditoPatrimonial tarjeta : tarjetasCreditoPatrimoniales.getTarjetasCreditoPatrimoniales()) {
			if (tarjeta.getId() == id)
				return tarjeta;
		}
		return new TarjetaCreditoPatrimonial();
	}

	public TarjetasCreditoPatrimoniales obtenerTarjetasDeCreditoPatrimonialesDePersona(@Body Integer id, Exchange exchange) {
		List<TarjetaCreditoPatrimonial> tarjetas = new ArrayList<TarjetaCreditoPatrimonial>();
		for (TarjetaCreditoPatrimonial tarjeta : tarjetasCreditoPatrimoniales.getTarjetasCreditoPatrimoniales()) {
			if (tarjeta.getIdPersona() == id)
				tarjetas.add(tarjeta);
		}

		return new TarjetasCreditoPatrimoniales(tarjetas);
	}

	public PrestamosPatrimoniales obtenerPrestamosPatrimoniales(Exchange exchange) {
		return prestamosPatrimoniales;
	}

	public PrestamoPatrimonial obtenerPrestamoPatrimonial(@Body Integer id, Exchange exchange) {
		for (PrestamoPatrimonial prestamo : prestamosPatrimoniales.getPrestamosPatrimoniales()) {
			if (prestamo.getId() == id)
				return prestamo;
		}

		return new PrestamoPatrimonial();
	}

	public PrestamosPatrimoniales obtenerPrestamosPatrimonialesDePersona(@Body Integer id, Exchange exchange) {
		List<PrestamoPatrimonial> prestamos = new ArrayList<PrestamoPatrimonial>();
		for (PrestamoPatrimonial prestamo : prestamosPatrimoniales.getPrestamosPatrimoniales()) {
			if (prestamo.getIdPersona() == id)
				prestamos.add(prestamo);
		}

		return new PrestamosPatrimoniales(prestamos);
	}
}
