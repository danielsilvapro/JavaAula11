package br.com.danielsilva;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AplicacaoDivisao {
	
	public static void main (String args []) {
		
		double dividendo, divisor;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o dividendo");
		dividendo = entrada.nextDouble();
		System.out.println("Digite o divisor");
		divisor = entrada.nextDouble();
		
		System.out.println(Divisao.calcula(dividendo, divisor));
	} catch (ExcexaoDivisaoPorZero e) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Log.grava(sdf.format(new Date()) + ".log", "Dividendo: " +
		dividendo + "Divisor:" + divisor + " - " + );
	}

}
