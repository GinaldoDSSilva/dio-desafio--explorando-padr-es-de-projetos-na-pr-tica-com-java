package com.github.ginaldo.gof;

/**
 * Singleton "apressado"
 * 
 * @author Ginaldo
 *
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return instancia;
	}

}
