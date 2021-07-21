package List.exerciciosPropostos;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosPropostos {
    public static void main(String[] args) {
        List<MesTemperatura> mesTemperaturas = new ArrayList<>(){{
            add(new MesTemperatura(1, "janeiro", 28.5));
            add(new MesTemperatura(2, "Fevereiro", 29.2));
            add(new MesTemperatura(3, "Março", 28.6));
            add(new MesTemperatura(4, "Abril", 28.2));
            add(new MesTemperatura(5, "Maio", 27.4));
            add(new MesTemperatura(6, "Junho", 25.3));
        }};

        double media = MesTemperatura.calculaMediaSemestralTemp(mesTemperaturas);

        System.out.println("--------------Meses Acima da média em temperatura--------------");
        List<MesTemperatura> mesesAcimaDaMedia = MesTemperatura.temperaturasAcimaDaMedia(mesTemperaturas, media);
        System.out.println(mesesAcimaDaMedia.toString());
    }
}

class MesTemperatura {

    private int idMes;
    private String nomeMes;
    private double temperatura;



    public static double calculaMediaSemestralTemp(List<MesTemperatura> mesesTemps){
        double somatorio = 0.0;
        for (MesTemperatura mesTemperatura:mesesTemps){
            somatorio += mesTemperatura.getTemperatura();
        }

        double media = somatorio/ mesesTemps.size();
        return  media;
    }


    public static List<MesTemperatura> temperaturasAcimaDaMedia(List<MesTemperatura> mesesTemps, double media) {
        List<MesTemperatura> temperaturasAcimaDaMedia = new ArrayList<>();
        for (MesTemperatura mesTemperatura: mesesTemps){
            if (mesTemperatura.getTemperatura() > media)
                temperaturasAcimaDaMedia.add(mesTemperatura);
        }
        return temperaturasAcimaDaMedia;
    }


    @Override
    public String toString() {
        return nomeMes;
    }

    public MesTemperatura(int idMes, String nomeMes, double temperatura) {
        this.idMes = idMes;
        this.nomeMes = nomeMes;
        this.temperatura = temperatura;
    }

    public int getIdMes() {
        return idMes;
    }

    public void setIdMes(int idMes) {
        this.idMes = idMes;
    }

    public String getNomeMes() {
        return nomeMes;
    }

    public void setNomeMes(String nomeMes) {
        this.nomeMes = nomeMes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
