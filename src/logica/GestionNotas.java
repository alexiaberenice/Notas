package logica;

import java.util.ArrayList;

public class GestionNotas {
    ArrayList<Double> notas = new ArrayList<>() ;
    //methods
    public void agregarNota(double n){
        notas.add(n);
    }
    public double promedio(double n){
        double prom = 0;
        for(double d:notas){
            prom += d;
        }
        return prom/notas.size();
    }
    public int aprobados(){
        int control=0;
        for (double b:notas){
            if(b>=5){
                control++;
            }
        }
        return control;
    }

}

