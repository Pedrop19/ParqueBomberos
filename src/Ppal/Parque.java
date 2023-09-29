package Ppal;

import java.util.LinkedList;

public class Parque {
	
	private int idParque;
	private String ubicacion;
	private LinkedList<Bombero> bomberos;
	private LinkedList<String> avisos;
	
	//Creador basico
	public Parque(int idParque, String ubicacion) {
		this.idParque = idParque;
		this.ubicacion = ubicacion;
		this.bomberos = new LinkedList<Bombero>();
		this.avisos = new LinkedList<String>();
	}
	
	public void addBombero(Bombero b) {
		bomberos.add(b);
	}
	public int getIdParque() {
		return idParque;
	}

	public void setIdParque(int idParque) {
		this.idParque = idParque;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	 public void addAviso(String aviso) {
		this.avisos.add(aviso);
	 }
	 
	 public void mostrarAviso() {
		 if(this.avisos.isEmpty())
			 System.out.println("No hay avisos");
		 else
			 System.out.println(avisos);
	 }
	 
	 public void deleteAviso() {
		if(!this.avisos.isEmpty())
		this.avisos.removeFirst();
	 }
	 
	
	  @Override
	    public String toString() {
	        return "Parque[id: " + this.idParque + "; Ubicación: " + this.ubicacion +
	               "; Bomberos: " + this.bomberos + "Avisos:" + this.avisos;
	    }

	  @Override
	   public boolean equals(Object obj) {
		  boolean result = false;
	      Parque p = (Parque) obj;
	      if(this.idParque == p.getIdParque())
	    	  result = true;
	      return result;
	    }
}
