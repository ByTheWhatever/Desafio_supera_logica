package br.com.supera.primeiro.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
	
	public static void main (String[] args) {
	
	// declarando scanner para receber entrada de valores com try with resources  	
	
	try (Scanner in = new Scanner(System.in);) {
		int tamanhoDoArray = in.nextInt();	
		System.out.println("Insira os valores desejados");
		
	// declarando a Array que ira receber os valores
		
		List<Integer> entradaNum = new ArrayList<Integer>();
		for (int j = 0; j < tamanhoDoArray; j++) {
			entradaNum.add(in.nextInt());
		}
		
	// declarando arrays que irao separar pares e impares
		
		List<Integer> numPar = new ArrayList<Integer>();
		List<Integer> numImpar = new ArrayList<Integer>();
		
	// separando os numeros pares dos impares
		
		for (int i = 0; i < entradaNum.size(); i++) {
				if (entradaNum.get(i) % 2 == 0){	
					numPar.add(entradaNum.get(i));
				} 
		}
		
		for (int x = 0; x < entradaNum.size(); x++) {
					if (entradaNum.get(x) % 2 != 0){	
					numImpar.add(entradaNum.get(x));
					}
					
		}
		
	// fazendo a ordenacao dos numeros 
		
		Collections.sort(numPar);
		Collections.sort(numImpar);
		Collections.reverse(numImpar);
		numPar.stream().forEach(numero -> System.out.println(numero));
		numImpar.stream().forEach(numero -> System.out.println(numero));
	}	
	
}
}
