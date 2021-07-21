package set.exerciciosPropostos;

import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        System.out.println("\n----------- Exiba todas as cores o arco-íris uma abaixo da outra -----------");
        for (String cor:cores){
            System.out.println(cor);
        }

        System.out.println("\n----------- A quantidade de cores que o arco-íris tem -----------");
        System.out.println(cores.size());


        System.out.println("\n----------- Exiba as cores em ordem alfabética -----------");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("\n----------- Exiba as cores na ordem inversa da que foi informada -----------");
        List<String> cores3 = new ArrayList<>(cores);
        Collections.reverse(cores3);

        System.out.println("\n-----------  Exiba todas as cores que começam com a letra ”v” -----------");
        for (String cor:cores) {
            if (cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("\n----------- Remova todas as cores que não começam com a letra “v” -----------");

        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()){
            if (iterator.next().startsWith("v"))
                iterator.remove();
        }


        System.out.println("\n----------- Limpe o conjunto -----------");
        cores.clear();


        System.out.println("\n----------- Confira se o conjunto está vazio-----------");
        System.out.println(cores.isEmpty());


    }

}
