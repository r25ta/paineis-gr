package br.com.pamcary.paineisgr.dto;

import java.io.Serializable;

public class PainelGrDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String indicador;
	private String valor;
	
	
	
	public PainelGrDTO(String indicador, String valor) {
		super();
		this.indicador = indicador;
		this.valor = valor;
	}
	
	public String getIndicador() {
		return indicador;
	}
	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "PainelGRDto [indicador=" + indicador + ", valor=" + valor + "]";
	}
	
	
}
