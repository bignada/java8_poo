package com.ychar.practica_poo.Interfaces;

@FunctionalInterface
public interface ICrear<T> {
	public T crear(Object ...params);
}
