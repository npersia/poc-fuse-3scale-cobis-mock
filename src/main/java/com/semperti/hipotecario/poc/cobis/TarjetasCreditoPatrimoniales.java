package com.semperti.hipotecario.poc.cobis;

import java.util.List;
import java.util.ArrayList;

import java.io.Serializable;

public class TarjetasCreditoPatrimoniales implements Serializable {
	protected List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimonial = new ArrayList<TarjetaCreditoPatrimonial>();
	public TarjetasCreditoPatrimoniales() {}

	public TarjetasCreditoPatrimoniales(List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimonial) {
		this.tarjetasCreditoPatrimonial = tarjetasCreditoPatrimonial;
	}

	public List<TarjetaCreditoPatrimonial> getTarjetasCreditoPatrimoniales() {
		return tarjetasCreditoPatrimonial;
	}

	public void setTarjetasCreditoPatrimoniales(List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimonial) {
		this.tarjetasCreditoPatrimonial = tarjetasCreditoPatrimonial;
	}
}
