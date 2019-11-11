package br.com.pamcary.paineisgr.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class TransformaNumero {
	private static final int UNIDADE_QUATRILHAO = 15;
	private static final int UNIDADE_TRILHAO = 12;
	private static final int UNIDADE_BILHAO = 9;
	private static final int UNIDADE_MILHAO = 6;
	
	public static void main(String[] args) {
		
		BigDecimal valor, divisor;
		valor = new BigDecimal("1205600000000000");  
				
		String strValor = String.valueOf(valor);
		
		if(strValor.length() >UNIDADE_MILHAO && strValor.length()<=UNIDADE_BILHAO ) {
			System.out.println("Milh�o");
			divisor = new BigDecimal("1000000");
			System.out.println("Exibe R$ " + valor.divide(divisor) +" MI");
			
		}else if(strValor.length()>UNIDADE_BILHAO && strValor.length()<=UNIDADE_TRILHAO) {
			System.out.println("Bilhao");
			divisor = new BigDecimal("1000000000");
			System.out.println("Exibe R$ " + valor.divide(divisor) +" BI");
			
			
		}else if(strValor.length()>UNIDADE_TRILHAO && strValor.length()<=UNIDADE_QUATRILHAO) {
			System.out.println("Trilhao");
			divisor = new BigDecimal("1000000000000");
			System.out.println("Exibe R$ " + valor.divide(divisor) +" TRI");
			
			
		}else if(strValor.length()>UNIDADE_QUATRILHAO){
			System.out.println("Acima de Trilh�es n�o exibe");
			
		}else if(strValor.length()>3 && strValor.length()<=UNIDADE_MILHAO) {
			System.out.println("Milhar");
			System.out.println("Exibe " +  valor);

			
		}else  {
			System.out.println("Centena");
			System.out.println("Exibe " + valor);

		}
			 
		
		
		
		/*
		System.out.println("String " + x);
		NumberFormat nf = NumberFormat.getCurrencyInstance( new Locale("pt","BR"));  
		System.out.println(valor);
		String formatado = nf.format (valor);
		System.out.println(formatado);
*/
	}

	@SuppressWarnings("unused")
	private String formatarValor(String valor, final int qtde) {
		String result = null;
		int x = valor.length() - qtde;
		System.out.println(x);
		
		return result;
	}
}
