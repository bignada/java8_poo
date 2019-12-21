package com.ychar.practica_poo.UI;
import java.util.ArrayList;
import com.ychar.practica_poo.GenericControl.GenericControl;
import com.ychar.practica_poo.Objetos.*;

public class UIJuego {
	private static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	private static void cargarJugadores() {
		
		GenericControl<Jugador> controlJugadores = new GenericControl.Builder<Jugador>(Jugador::new).build();
		GenericControl<Revolver> controlRevolveres = new GenericControl.Builder<Revolver>(Revolver::new).build();
		
		System.out.println(controlRevolveres.getTipo());
		System.out.println(controlJugadores.getTipo());
		jugadores.add(new Jugador());
	}
	
	public static void mostrarJuego() {
		cargarJugadores();
	}
}
