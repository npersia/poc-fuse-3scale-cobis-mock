package com.semperti.hipotecario.poc.cobis;

import javax.jws.WebParam;
import javax.jws.WebMethod;
import javax.jws.WebService;

import java.util.List;

@WebService(serviceName="cobisService")
public interface CobisService {
	//public List<Persona> obtenerPersonas(@WebParam(name="Transaction", targetNamespace="") Header header);

	@WebMethod(action="obtenerPersonas")
	public Personas obtenerPersonas();

	@WebMethod(action="obtenerPersona")
	public Persona obtenerPersona(@WebParam(name="id", targetNamespace="") int id);

	@WebMethod(action="obtenerTelefonos")
	public Telefonos obtenerTelefonos();

	@WebMethod(action="obtenerTelefono")
	public Telefono obtenerTelefono(@WebParam(name="id", targetNamespace="") int id);

	@WebMethod(action="obtenerTelefonosDePersona")
	public Telefonos obtenerTelefonosDePersona(@WebParam(name="id", targetNamespace="") int id);

	@WebMethod(action="obtenerTarjetasCreditoPatrimoniales")
	public TarjetasCreditoPatrimoniales obtenerTarjetasCreditoPatrimoniales();

	@WebMethod(action="obtenerTarjetaCreditoPatrimonial")
	public TarjetaCreditoPatrimonial obtenerTarjetaCreditoPatrimonial(@WebParam(name="id", targetNamespace="") int id);

	@WebMethod(action="obtenerTarjetasDeCreditoPatrimonialesDePersona")
	public TarjetasCreditoPatrimoniales obtenerTarjetasDeCreditoPatrimonialesDePersona(@WebParam(name="id", targetNamespace="") int id);

	@WebMethod(action="obtenerPrestamosPatrimoniales")
	public PrestamosPatrimoniales obtenerPrestamosPatrimoniales();

	@WebMethod(action="obtenerPrestamoPatrimonial")
	public PrestamoPatrimonial obtenerPrestamoPatrimonial(@WebParam(name="id", targetNamespace="") int id);

	@WebMethod(action="obtenerPrestamosPatrimonialesDePersona")
	public PrestamosPatrimoniales obtenerPrestamosPatrimonialesDePersona(@WebParam(name="id", targetNamespace="") int id);
}
