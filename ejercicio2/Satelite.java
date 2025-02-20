package ejercicio2;

public class Satelite extends Astros {
    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private String planetaAlQuePertenece;

    public Satelite(String nombre, double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, double distanciaAlPlaneta, double orbitaPlanetaria, String planetaAlQuePertenece) {
        super(nombre, radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad);
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaAlQuePertenece = planetaAlQuePertenece;
    }
    
    public double getDistanciaAlPlaneta() {
		return distanciaAlPlaneta;
	}
    
    public double getOrbitaPlanetaria() {
    	return orbitaPlanetaria;
    }
    
    public String getPlanetaAlQuePertenece() {
    	return planetaAlQuePertenece;
    }
    
    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
    	this.distanciaAlPlaneta=distanciaAlPlaneta;
    }
    
    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
    	this.orbitaPlanetaria=orbitaPlanetaria;
    }
    
    public void setPlanetaAlQuePertenece(double PlanetaAlQuePertenece) {
    	this.planetaAlQuePertenece=planetaAlQuePertenece;
    }
    
    public void imprime() {
        System.out.println("Satlite: " + getNombre());
        System.out.println("Distancia planeta: " + getDistanciaAlPlaneta() + " km");
        System.out.println("Orbita planetaria: " + getOrbitaPlanetaria() + " dias");
        System.out.println("Planeta al que pertenece: " + getPlanetaAlQuePertenece());
    }

	
}
