package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		// INSERIR ITENS � LISTA
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// INSERIR ITEM NA POSI��O 2
		// Insere item sem remover o atual
		list.add(2,"Marco");
		
		// Tamanho da lista
		System.out.println(list.size());
		
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		// Compara valor e remove
		// list.remove("Anna");
		
		// Remove por posi��o
		// list.remove(1);
		
		// Remo��o por predicado (fun��es lambda)
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		// Encontrar a posi��o de um elemento pelo valor
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// Caso n�o encontre o valor, retorna -1
		System.out.println("Index of Bob: " + list.indexOf("Henrique"));
		
		System.out.println("-------------------");
		
		// FIltrar dados em uma lista atrav�s de express�o lambda
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x: result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		// Filtrar primeiro elemento que atende a condi��o da express�o
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
