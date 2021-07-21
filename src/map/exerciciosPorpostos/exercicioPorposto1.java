package map.exerciciosPorpostos;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.*;

public class exercicioPorposto1 {

    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> estados = new HashMap<>(){{
          put("PE", 9616621);
          put("AL", 335143);
          put("CE", 9187103);
          put("RN", 3534265);
        }};

        System.out.println("\nSubstitua a população do RN por 3534165");
        estados.put("RN", 3534165);

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione:PB - 4039277");
        if (!estados.containsKey("PB")){
            estados.put("PB", 4039277);
        }

        System.out.println("\nExiba a população de PE");
        System.out.println(estados.get("PE") + " pessoas");


        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 335143);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(estados1);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> estados2 = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 335143);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(estados2);


        System.out.println("\nmenor população");
        Integer menorPopulacao = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String estadoMenosPopuloso;

        for (Map.Entry<String, Integer> entry:entries){
            estadoMenosPopuloso = entry.getKey();
            if (entry.getValue() == menorPopulacao)
                System.out.println(estadoMenosPopuloso);
        }



        System.out.println("\nMaior população");
        Integer maiorPopulacao = Collections.max(estados.values());
        Set<Map.Entry<String, Integer>> entries1 = estados.entrySet();
        String estadoMaisPopuloso;

        for (Map.Entry<String, Integer> entry:entries1){
            estadoMaisPopuloso = entry.getKey();
            if (entry.getValue() == maiorPopulacao)
            System.out.println(estadoMaisPopuloso);
        }


        System.out.println("\nSoma da população");
        Set<Map.Entry<String, Integer>> entries3 = estados.entrySet();
        Integer somaPopulacao = 0;

        for (Map.Entry<String, Integer> entry:entries3){
            somaPopulacao += entry.getValue();
        }
        System.out.println(somaPopulacao);

        System.out.println("\nMédia da população");
        Set<Map.Entry<String, Integer>> entries4 = estados.entrySet();
        Integer somaPopulacao1 = 0;

        for (Map.Entry<String, Integer> entry:entries4){
            somaPopulacao1 += entry.getValue();
        }
        int media = somaPopulacao1/estados.size();
        System.out.println(media);

        System.out.println("\nRemova todos os estados com população menor que 4000000(4 milhões)");
        Iterator<Integer> iterator = estados.values().iterator();
        while (iterator.hasNext()){
            if (iterator.next() < 4000000)
                iterator.remove();
        }
        System.out.println(estados);

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        estados.clear();
        System.out.println(estados);

        System.out.println("Confira se a lista está vazia: " + estados.isEmpty());

    }
}
