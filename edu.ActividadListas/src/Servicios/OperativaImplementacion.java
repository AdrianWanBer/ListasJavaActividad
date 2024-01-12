package Servicios;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz{
	
	public void pedidaNumeros (Scanner sc, List<Integer> listaNumerosTemp) {
		
		System.out.println("Cuantos numeros necesitas: ");
		int cantidad = sc.nextInt();
		
		for(int i = 0; i < cantidad ; i++) {
			System.out.println("Introduce el numero");
			int numero = sc.nextInt();
			listaNumerosTemp.add(numero);
		}
	}
	
	public void mostrarLista(List<Integer> listaNumerosTemp) {
		System.out.println("Mostrando lista con bucle Foreach");
		for(Integer recorrido :listaNumerosTemp) {
		      System.out.println(recorrido);
		    }
	}
	
	public void cambiarPosicion(List<Integer> listaNumerosTemp) {
		System.out.println("Cambiando posiciones");
		int numeroTemp = listaNumerosTemp.get(1);
		int numeroTempDos = listaNumerosTemp.get(3);
		listaNumerosTemp.set(1,numeroTempDos);
		listaNumerosTemp.set(3, numeroTemp);
		for(Integer recorrido :listaNumerosTemp) {
		      System.out.println(recorrido);
		    }
	}
	
	public void mostrarListaDos(List<Integer> listaNumerosTemp) {
		System.out.println("Mostrando lista con bucle For");
		for (int i = 0; i < listaNumerosTemp.size(); i++) {
			System.out.println(listaNumerosTemp.get(i));
		}
	}
	
}
