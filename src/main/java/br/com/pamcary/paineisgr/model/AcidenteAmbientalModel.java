package br.com.pamcary.paineisgr.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class AcidenteAmbientalModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private long indicador;
	private BigDecimal valor;
	
	public long getIndicador() {
		return indicador;
	}
	public void setIndicador(long indicador) {
		this.indicador = indicador;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
}
