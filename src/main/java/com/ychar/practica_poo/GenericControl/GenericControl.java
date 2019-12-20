package com.ychar.practica_poo.GenericControl;

import java.util.function.Supplier;

import com.ychar.practica_poo.Interfaces.IGenericActions;

public class GenericControl<T>{
	protected String objeto = null;
	
	public static class GenericControlBuilder<T> {
		private GenericControl<String> controlGenerico = new GenericControl<>();
		private Supplier<String> supplier;
		
		public GenericControl<String> build() {
			controlGenerico.objeto = createObject(String::new);
			return this.controlGenerico;
		}
		
		private String createObject(Supplier<String> supplier) {
			return supplier.get();
		}
		
	}

	
}
