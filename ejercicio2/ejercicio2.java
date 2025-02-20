package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ejercicio2 {
	public static void main (String [] args) {
		
		ArrayList<Astros>astros = new ArrayList<>();
		
		// 3 planetas
		
		Planeta Tierra = new Planeta("Tierra", 6371.0, 23.9, 5.972E24, 15, 9.81, 149.6, 365.25);
		Planeta Marte = new Planeta("Marte", 3389.5, 24.6, 6.4171E23, -65, 3.71, 227.9, 687);
		Planeta Jupiter = new Planeta("Júpiter", 69911.0, 9.9, 1.898E27, -110, 24.79, 778.5, 4333);
        
        // 3 satelites
        
        Satelite Luna = new Satelite("Luna", 1737.1, 655.7, 7.35E22, -20, 1.62, 384400, 27.3, "Tierra");
        Satelite Fobos = new Satelite("Fobos", 14.1, 5.65, 1.0659E16, -40, 0.0057, 9377, 0.3, "Marte");
        Satelite Calisto = new Satelite("Calisto", 6.2, 30.3, 1.4762E15, -40, 0.003, 23460, 1.3, "Jupiter");
        
        
        Tierra.meterSatelite(Luna);
        Marte.meterSatelite(Fobos);
        Jupiter.meterSatelite(Calisto);
        
        astros.add(Tierra);
        astros.add(Marte);
        astros.add(Jupiter);	
        astros.add(Luna);
        astros.add(Fobos);
        astros.add(Calisto);
        
        Menu(astros);

	}
	
	
	public static void Menu(ArrayList<Astros> astros) {
		Scanner scanner = new Scanner(System.in);
		
        while (true) {
            System.out.println("Astros");
            Iterator<Astros> iterador = astros.iterator();
            int index = 1;
            while (iterador.hasNext()) {
                System.out.println(index + ". " + iterador.next().getNombre());
                index++;
            }
            
            System.out.println("0. Salir");
            System.out.print("Selecciona un astro: ");
            int opcion = scanner.nextInt();
      
			if (opcion == 0) {
            	break;
            }
            
            if (opcion < 1 || opcion > astros.size()) {
                System.out.println("Error");
            } else {
                astros.get(opcion - 1).imprime();
            }
           }
        }
	}

