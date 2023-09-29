package Ppal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ppal {
	
	public static void main(String[] args) {

	//VERSION 0.1
	/*Bombero bombero1 = new Bombero(0, "Jose", 27, OFICIAL);
	Bombero bombero2 = new Bombero(1, "Alberto", 28, SUBOFICIAL);
	Bombero bombero3 = new Bombero(3, "Fran", 30, CABO);
	
	Parque parque1 = new Parque(1001, "Canada");
	Parque parque2 = new Parque(1002, "España");
	Parque parque3 = new Parque(1003, "Francia");
	
	parque1.addAviso("Aviso 1. Parque 1");
	System.out.println(parque1.toString());
	System.out.println(parque2.toString());
	System.out.println(parque3.toString());
	
	parque1.addAviso("Aviso 1. Parque 1");
	parque2.addAviso("Aviso 2");
	parque3.addAviso("Aviso 3");
	
	parque2.mostrarAviso();
	parque3.mostrarAviso();*/
	
	Menu();
	
	}
	
	//VERSION 0.2
	public static void Menu() {
		
		Scanner enteros = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);
		
		LinkedList<Parque> parques = new LinkedList<Parque>();
		
		int opc = 0;
		int idB = 0;
		int idP = 0;
		
		System.out.println("--- SISTEMA DE GESTION PARQUES DE BOMBEROS ---");
		
		do {
			
			System.out.println("Bienvenido, eliga una opción para comenzar[1-7]");
			System.out.println("1. Añadir Parque");
			System.out.println("2. Listar Parques");
			System.out.println("3. Añadir Bombero");
			System.out.println("4. Añadir Aviso");
			System.out.println("5. Listar Avisos");
			System.out.println("6. Borrar Avisos");
			System.out.println("7. Salir");
			opc = enteros.nextInt();
			
			switch(opc) {
				
				case 1:
					
					System.out.println("-- AÑADIR PARQUE --");
					System.out.println("Introduzca la ubicación del parque a crear: ");
					String ubicacion = strings.next();
					parques.add(new Parque(idP, ubicacion));
					System.out.println("Parque " + idP + "creado.");
					idP++;
					break;
					
				case 2:
					
					System.out.println("-- LISTAR PARQUES --");
					for (int i = 0; i < parques.size(); i++) {
						System.out.println((i + 1) + " - " + parques.get(i).getUbicacion());
					}
					
					break;
					
				case 3:
					
					System.out.println("--- AÑADIR BOMBERO ---");
					System.out.print("Introduce su nombre completo: ");
					String nombreCompleto = strings.next();
					System.out.print("Introduce la edad: ");
					int edad = enteros.nextInt();
					System.out.println("Seleccione un rango (1-4): "
							+ "1. BOMBERO 2. CABO 3. SUBOFICIAL 4. OFICIAL");
					int r = enteros.nextInt();
					Rango rango = null;
					switch(r) {
						case 1: 
							rango = Rango.BOMBERO;
							break;
						case 2: 
							rango = Rango.CABO;
							break;
						case 3: 
							rango = Rango.SUBOFICIAL;
							break;
						case 4: 
							rango = Rango.OFICIAL;
							break;
						default:
							System.out.println("ERROR: Opcion no valida");
							break;
					}
					System.out.println("A continuación se mostraran los "
							+ "parques disponibles que a los que se puede añadir el "
							+ "bombero a crear.");
					System.out.println(parques);
					System.out.println("Selecciona el id del parque: ");
					int parque = enteros.nextInt();
					
					for (int i = 0; i < parques.size(); i++) {
						if(parques.get(i).getIdParque() == parque) {
							parques.get(parque).addBombero(new Bombero(idB, nombreCompleto, edad, rango));
							System.out.println("Bombero creado");
							idB++;
						}
					}
					break;
				case 4:
					System.out.println("A continuación se mostraran los "
							+ "parques disponibles que a los que se puede añadir el "
							+ "aviso.");
					System.out.println(parques);
					System.out.println("Selecciona el parque: ");
					parque = enteros.nextInt();
					System.out.print("Introduce el aviso: ");
					parques.get(parque).addAviso(strings.next());
					System.out.println("Aviso agregado correctamente");
					
					break;
				case 5:
					System.out.println("A continuación se mostraran los "
							+ "parques disponibles ");
					System.out.println(parques);
					System.out.println("Selecciona el id del parque: ");
					parque = enteros.nextInt();
					
					for (int i = 0; i < parques.size(); i++) {
						if(parques.get(i).getIdParque() == parque) 						
							parques.get(i).mostrarAviso();
					}
					break;
				case 6:
					System.out.println("A continuación se mostraran los "
							+ "parques disponibles ");
					System.out.println(parques);
					System.out.println("Selecciona el id del parque: ");
					parque = enteros.nextInt();
					
					for (int i = 0; i < parques.size(); i++) {
						if(parques.get(i).getIdParque() == parque) {
							parques.get(i).deleteAviso();
						}
							
					}
					break;
				case 7:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("ERROR: OPCIÓN NO DISPONIBLE");
			}
			
		}while(opc != 7);
	}
}
