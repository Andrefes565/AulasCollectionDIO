package streamAPI.exerciciosStreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosEstramAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "4", "3", "7", "5", "6", "4", "9", "9");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream()
                .forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet()) // aqui ele passou List para um SET
                .forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosAleatoriosInteiros = numerosAleatorios.stream()
                .map(Integer::parseInt)         // O map transforma a lista de um tipo para outro
                .collect(Collectors.toList());  // Aqui o Collect colocou dentro de uma lista de numeros inteiros

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> numerosParesMaioresQueDois = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0 && n > 2) // filter serve para fazer filtros
                .collect(Collectors.toList());
        System.out.println(numerosParesMaioresQueDois);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        System.out.println("Remova os valores ímpares: ");
        numerosAleatoriosInteiros.removeIf(n -> !(n % 2 == 0) );
        System.out.println(numerosAleatoriosInteiros);

        System.out.println("Ignorar os primeiros 3 valores da lista e imprima o restante:");
        numerosAleatoriosInteiros.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("Retirando os números repetidos da lista, quantos numeros ficam ?");
        long qtdNumNaoRepetidos = numerosAleatoriosInteiros.stream()
                .distinct()
                .count();

        System.out.println(qtdNumNaoRepetidos);


        System.out.println("Mostre o menor valor da lista ?");
        numerosAleatoriosInteiros.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.println("Mostre o maior valor da lista ?");
        numerosAleatoriosInteiros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);


        System.out.println("Pegue apenas valores ímpares e some!");
        Integer soma = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(soma);


        int somaDosNumerosPares = numerosAleatoriosInteiros.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteiros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteiros.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);

    }
}
