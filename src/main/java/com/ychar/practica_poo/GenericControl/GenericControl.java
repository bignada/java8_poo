package com.ychar.practica_poo.GenericControl;

import java.util.function.Supplier;

public class GenericControl<T>{
	protected T objeto = null;
	
	public GenericControl(T object){
		this.objeto = object;
	}
	
	public String getTipo() {
		return objeto.toString();
	}
	
	
	public static class Builder<T> {
		private GenericControl<T> controlGenerico;
		
		@SuppressWarnings("hiding")
		public <T> Builder(Supplier<T> supplier){
			this.controlGenerico = new <T>GenericControl(supplier.get());
		}
		
		public GenericControl<T> build() {
			return this.controlGenerico;
		}
		
	}
	
	
}
