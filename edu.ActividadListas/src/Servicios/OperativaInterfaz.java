package Servicios;

import java.util.List;
import java.util.Scanner;

public interface OperativaInterfaz {

	public void pedidaNumeros (Scanner sc, List<Integer> listaNumerosTemp);
	
	public void mostrarLista(List<Integer> listaNumerosTemp);
	
	public void cambiarPosicion(List<Integer> listaNumerosTemp);
	
	public void mostrarListaDos(List<Integer> listaNumerosTemp);
}
