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


	public int getSize() {
		return this.size;
	}

	public int getNumRequests() {
		return this.numRequests;
	}

	public long getLastRequestTS() {
		return this.lastRequestTS;
	}


	public void setSize(int size) {
		this.size = size;
	}

	public void setLastRequestTS(long newTS) {
		this.lastRequestTS = newTS;
	}


	public void incNumRequests() {
		this.numRequests += 1;
	}



}
