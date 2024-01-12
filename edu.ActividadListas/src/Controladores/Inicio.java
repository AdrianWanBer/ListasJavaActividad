package Controladores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = new ArrayList();
		Scanner sc = new Scanner (System.in);
		
		OperativaInterfaz oi = new OperativaImplementacion();
		oi.pedidaNumeros(sc, listaNumeros);
		System.out.println("-----------------");
		oi.mostrarLista(listaNumeros);
		System.out.println("-----------------");
		oi.cambiarPosicion(listaNumeros);
		System.out.println("-----------------");
		oi.mostrarListaDos(listaNumeros);
		
		
	}
	
}
