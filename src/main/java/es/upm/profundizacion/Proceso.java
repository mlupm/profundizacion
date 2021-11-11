package es.upm.profundizacion;

import java.util.Date;

/**
 * Object Proceso
 *
 * @author carlos
 */

public class Proceso {

	private int size;
	private int numRequests;
	private long lastRequestTS;

	public Proceso() {
		this.size = 0;
		this.numRequests = 0;
		this.lastRequestTS = new Date().getTime();
	}

	// Getters

	public int getSize() {
		return this.size;
	}

	public int getNumRequests() {
		return this.numRequests;
	}

	public long getLastRequestTS() {
		return this.lastRequestTS;
	}

	// Incrementos

	public void incSize(int size) {
		this.size += size;
	}

	public void incNumRequests() {
		this.numRequests += 1;
	}

	public void updateLastRequestTS() {
		this.lastRequestTS = new Date().getTime();
	}

}
