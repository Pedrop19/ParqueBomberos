package Ppal;

import java.util.Scanner;
import static Ppal.Rango.*;

public class Bombero {
	
    private int idBombero;
    private String nombreCompleto;
    private int edad;
    private Rango rango;
    
    //Constructor
    
    public Bombero(int idBombero, String nombreCompleto, int edad, Rango rango) {
    	this.idBombero = idBombero;
    	this.nombreCompleto = nombreCompleto;
    	this.edad = edad;
    	this.rango = rango;
    }
    
    public Bombero(int idBombero, Rango rango) {
    	this.idBombero = idBombero;
    	this.rango = rango;
    }
    
    //Getter and Setter

	public int getIdBombero() {
		return idBombero;
	}

	public void setIdBombero(int idBombero) {
		this.idBombero = idBombero;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Rango getRango() {
		return rango;
	}

	public void setRango(Rango rango) {
		this.rango = rango;
	}
    

    //Override
	  @Override
	    public String toString() {
	        return "Bombero[id: " + this.idBombero + "; Nombre: " + this.nombreCompleto +
	               "; edad: " + this.edad + "; Rango: " + this.rango + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        boolean result = false;
	        Bombero b = (Bombero) obj;
	        if(this.idBombero == b.getIdBombero())
	            result = true;
	        return result;
	    }
}
