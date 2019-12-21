package com.ychar.practica_poo.GenericControl;

import java.util.function.Supplier;

public class GenericControl<T>{
	
	protected GenericControl(T objeto){
		this.objeto = objeto;
	}
	
	private T objeto = null;
	
	public String getTipo() {
		return objeto.toString();
	}
	
	
	public static class Builder<T> {
		private GenericControl<T> controlGenerico;
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Builder(Supplier<T> supplier){
			this.controlGenerico = new GenericControl(supplier.get());
		}
		
		public GenericControl<T> build() {
			return this.controlGenerico;
		}
		
	}
	
	
}
