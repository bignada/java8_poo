package com.ychar.practica_poo.UI;
import java.nio.file.attribute.AclEntry.Builder;
import java.util.ArrayList;
import java.util.List;

import com.ychar.practica_poo.GenericControl.GenericControl;
import com.ychar.practica_poo.Objetos.*;

public class UIJuego {
	private static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	private static void cargarJugadores() {
		GenericControl controlJugadores = new GenericControl<Jugador>(Jugador::new);
		System.out.println(controlJugadores.getTipo());
		jugadores.add(new Jugador());
	}
	
	public static void mostrarJuego() {
		cargarJugadores();
	}
}
