package map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        /*
        Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
        modelo = gol - consumo = 14,4km/l
        modelo = uno - consumo = 15,6 km/l
        modelo = mobi - consumo = 16,1 km/l
        modelo = hb20 - consumo = 14,5 km/l
        modelo = kwid - consumo = 15,6 km/l
        */

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");


        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
            put("Onix", 15.0);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("Tucson"));

        System.out.println("\nExiba o consumo do uno:  ");
        System.out.println(carrosPopulares.get("Gol"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEfeciente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry:entries){
            if (entry.getValue().equals(consumoMaisEfeciente)){
                modeloMaisEficiente =entry.getKey();
                System.out.println("Model mais efiiente: " + modeloMaisEficiente + " - " + consumoMaisEfeciente);
            }
        }

        System.out.println("Exiba a soma dos consumos:");
        Collection<Double> consumos1 = carrosPopulares.values();
        Double somatorio = 0.0;
        for (Double consumo:consumos1){
            somatorio += consumo;
        }
        System.out.println("Somatório dos consumos: "+ somatorio);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());


    }
}
