package br.com.supera.segundo.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SegundoDesafio {

	public static void main(String[] args) {

		
		// metodo try with resources para receber a entrada de valores
		try (Scanner in = new Scanner(System.in)) {
		System.out.println("Insira o valor desejado do tipo int");
		// por algum motivo eu tentei fazer o cast pra float mas não funciona
		// quebrei a cabeca entao resolvi deixar para depois
		Float valoresEntrada = (float)in.nextInt();			
		
		// utilizei o metodo indexOf para separar como devem ser lidos os valores
		// de entrada
		int indexDoPonto = valoresEntrada.toString().indexOf(".");
		
		// operacoes matematicas para dividir corretamente as casas decimais
		// o objetivo era separar por casas decimais o valor de entrada
		// acho que o erro do codigo pode estar aqui
		Integer valorEmReais = Integer.parseInt(valoresEntrada.toString().substring(0, indexDoPonto));
		Integer milhoes = (Integer) valorEmReais / 1_000_000 * 1_000_000; 
		Integer milhares = (Integer) valorEmReais / 100_000 * 100_000;
		Integer dezMil = (Integer) valorEmReais / 10_000 * 10_000;
		Integer mil = (Integer) valorEmReais / 1_000 * 1_000;
		Integer centenas = (Integer) valorEmReais / 100 * 100;
		Integer dezena = (Integer)  valorEmReais / 10 * 10;	
		Integer unidade = (Integer) valorEmReais / 1 ;	
	
		// lista com todas as casas decimais
		
		List<Integer> casasDecimais = Arrays.asList(milhoes, milhares,dezMil, mil, centenas,dezena,unidade);
	
		Float centavos = Float.parseFloat(valoresEntrada.toString().substring(indexDoPonto));
	
		// arrays com os valores que serao usados como referencia para as divisoes

	List<Float> valorNotas = Arrays.asList(100f,50f,20f,10f,5f,2f);
	List<Float> valorMoedas = Arrays.asList(1.00f,0.50f,0.25f,0.05f,0.01f);
	var controleNotas = 0;
	var controleMoedas = 0;
	List<String> restDivisaoNotas = new ArrayList<>(); 
	List<String> restDivisaoMoedas = new ArrayList<>();
	
	// metodos para separacao de notas, nao implementei o metodo das moedas pois
	// nao consegui resolver o metodo das notas ainda...
	
	loopcasasDecimais:
	for (var casaDecimal : casasDecimais){
		loopnotas:
		for (var nota : valorNotas) {
			if (casaDecimal % nota == 0){
				String frase = casaDecimal / nota + " nota(s) de R$ " + nota;
				restDivisaoNotas.add(frase);
				break loopnotas;
			} 
		}
	}
	// lambda para saida do metodo no console
	restDivisaoNotas.stream().forEach(nota -> System.out.println(nota));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	 while (centenas != 0 && centenas % valorNotas.get(controleNotas) == 0) {
//		float resultado = centenas / valorNotas.get(controleNotas);
//		String frase = resultado + " nota(s) de R$ " + valorNotas.get(controleNotas);
//		restDivisaoNotas.add(frase);
//		centenas = centenas - Math.round(resultado * valorNotas.get(controleNotas));
//		System.out.println(frase);
//		if (controleNotas != valorNotas.size()-1) {
//		controleNotas++;
//	} 	
//}	
//	while (centavos != 0 && centavos % valorMoedas.get(controleMoedas) == 0) {
//		float resultado = centavos / valorMoedas.get(controleMoedas);
//		String frase = resultado + " moeda(s) de R$ " + valorMoedas.get(controleMoedas);
//		restDivisaoMoedas.add(frase);
//		centavos = centavos - Math.round(resultado * valorMoedas.get(controleMoedas));
//		System.out.println(frase);
//		if (controleMoedas != valorMoedas.size()-1) {
//		controleMoedas++;
//	} 		
}	
}
}
