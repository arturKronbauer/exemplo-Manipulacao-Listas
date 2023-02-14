package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {

		// Instância de uma lista de strings
		List<String> list = new ArrayList<>();
		
		// Adicionando dados no final da lista
		list.add("Matheus");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
				
		// Adicionando um dado em um índice específico
		list.add(2, "Marco");
		
		// Escrevendo o tamanho da lista
		System.out.println("Qantidade de elementos na lista = "+list.size());
		
		// Escrevendo a lista com for each
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		// Removendo elementos que satisfazem a expressão lambida (predicado)
		// Remova todo objeto (x) que a primeira letra for 'M'
		list.removeIf(x -> x.charAt(0) == 'M');
		
		// Escrevendo a lista com for each
		for (String x : list) {
			System.out.println(x);
		}
		
		// Escrevendo o primeiro índice em que foram encontrados Bob e Marco
		System.out.println("---------------------");
		System.out.println("Posição de Bob na lista: " + list.indexOf("Bob"));
		System.out.println("Posição de Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
		// criando uma lista (resultado) com os elementos da lista original que começam com 'A'
		// collect(Collectors.toList()) comando para converter o resultado do filtro para list
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		// Escrevendo a lista com for each
		for (String x : resultado) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		// criando um filtro para pegar o primeiro elemendo da lista que começa com 'J'
		// findFirst().orElse(null) serve para retornar a primeira ocorrência do elemento ou null caso não exista
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
	}
}
