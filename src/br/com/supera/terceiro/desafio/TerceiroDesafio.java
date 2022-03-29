package br.com.supera.terceiro.desafio;

public class TerceiroDesafio {
	
	
	public static void main(String args[])
    {
        int arr[] = { 8,10,12,14,20,18,16 };
        int n = arr.length;
        int k = 2;
        // saida com a classe implementada e as variaveis com os valores declarados
        System.out.println("O total de pares é: " + comparador(arr, n, k));	
    }
	
	
	// ---------------------------------------------------------------------------
	
	//implemento do metodo int com declaracao das variaveis
	
	public static int comparador(int arr[],int n, int k) {
    
	// contador que vai receber o resultado dos calculos 
	int	contador = 0;
    
	// laco for que percorre a array e subtrai o alvo pelos numeros declarados 
	// na array
	for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
            if (arr[i] - arr[j] == k || arr[j] - arr[i] == k)
                contador++;
	 }
	return contador;
}
	

	
	
}
