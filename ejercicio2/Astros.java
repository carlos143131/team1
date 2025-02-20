package ejercicio2;

import java.util.ArrayList;

public abstract class Astros {
	
	private String nombre;
	private double radioEcuatorial;
	private double rotacionEje;
	private double masa;
	private double temperaturaMedia;
	private double gravedad;
	
	
	public Astros (String nombre, double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
		this.nombre=nombre;
		this.radioEcuatorial=radioEcuatorial;
		this.rotacionEje=rotacionEje;
		this.masa=masa;
		this.temperaturaMedia=temperaturaMedia;
		this.gravedad=gravedad;
		
	}

	
	public String getNombre() {
		return nombre;
	}
	
	public double getRadioEcuatorial() {
		return radioEcuatorial;
	}
	
	public double getRotacionEje() {
		return rotacionEje;
	}
	
	public double getMasa() {
		return masa;
	}
	
	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}
	
	public double getGravedad() {
		return gravedad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setRadioEcuatorial(double radioEcuatorial) {
		this.radioEcuatorial=radioEcuatorial;
	}
	
	public void setRotacionEje(double rotacionEje) {
		this.rotacionEje=rotacionEje;
	}
	
	public void setMasa(double masa) {
		this.masa=masa;
	}
	
	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia=temperaturaMedia;
	}
	
	public void setGravedad(double gravedad) {
		this.gravedad=gravedad;
	}
	
	public abstract void imprime();
	
}
