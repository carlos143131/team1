package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Planeta extends Astros {
    private double distanciaAlSol;
    private double orbitaAlSol;
    private boolean haySatelites;
    private ArrayList<Satelite> satelites;

    public Planeta(String nombre, double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, double distanciaAlSol, double orbitaAlSol) {
    	
        super(nombre, radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad);
        this.distanciaAlSol = distanciaAlSol;
        this.orbitaAlSol = orbitaAlSol;
       // this.haySatelites = tieneSatelites;
        this.satelites = new ArrayList<>();
    }

    public void meterSatelite(Satelite satelite) {
            satelites.add(satelite);
    }
    
    public void imprime() {
        System.out.println("Planeta: " + getNombre());
        System.out.println("Radio Ecuatorial: " + getRadioEcuatorial());
        System.out.println("Rotación sobre su eje: " + getRotacionEje());
        System.out.println("Masa: " + getMasa());
        System.out.println("Temperatura Media: " + getTemperaturaMedia());
        System.out.println("Gravedad: " + getGravedad());
        System.out.println("Distancia al Sol: " + distanciaAlSol);
        System.out.println("Órbita al Sol: " + orbitaAlSol);

        
        if (!satelites.isEmpty()) {
            System.out.println("Satelites:");
            for (Satelite satelite : satelites) {
                System.out.println(" - " + satelite.getNombre());
            }
        } else {
            System.out.println("No tiene");
        }
    }
}


