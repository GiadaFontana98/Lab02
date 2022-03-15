package it.polito.tdp.alien.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Dizionario {
	List<Parola>parole;

	public Dizionario() {
		
		this.parole = new LinkedList<Parola>();
	}
	
	
	public void add(String p, String t)
	{
	    boolean pp = Pattern.matches(("[a-zA-Z]+)"), p);
		boolean pt = Pattern.matches(("(*[a-zA-Z]+)"), t);  //il più indica uno o più lettere
		
		if(pp && pt)
		{
			//parole.put(p.toLowerCase(),t);
			if(parole.contains(p))
			{
				for(Parola pa : parole)
				{
					if(pa.nomep.compareTo(p)==0)
					{
						pa.getParole().add(t);
					}
				}
			}
			else
			{
				Parola parr= new Parola(p);
				parr.parole.add(t);
				this.parole.add(parr);
			}
		}
		
	}
	
	public String translate(String p)
	{
		for(Parola pa : parole)
		{
			if(pa.nomep.equals(p))
			{
				return pa.toString();
			}
		}
		
		return null;
	}
	

}