package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

public class Parola {
	
	String nomep;
	List<String> parole= new LinkedList<String> ();
	public Parola(String nomep) {
		super();
		this.nomep = nomep;
	
	}

	
	public List<String> getParole() {
		return parole;
	}
	public void setParole(List<String> parole) {
		this.parole = parole;
	}
	
	

}
