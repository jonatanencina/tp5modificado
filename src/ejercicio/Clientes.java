package ejercicio;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Clientes implements Comparable<Clientes>{
	private String nombre;
	private Integer edad;



	public Clientes(String nombre,Integer edad){
		
	this.nombre=nombre;
	this.edad=edad;
	
	
	
	}


//aca modifico el equalas para el metodo add

public boolean equals(Object obj){
	
	if(obj instanceof Clientes){
		
		Clientes otro=(Clientes)obj;
		
		if(this.getNombre().equalsIgnoreCase(otro.getNombre())){
			
			return true;
			
		}else{
			return false;
		}
	}else{
		return	false;
	}
		
		
	
}

public int hashCode(){
	
	return 1;
}
public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Integer getEdad() {
	return edad;
}
public void setEdad(Integer edad) {
	this.edad = edad;
}



///aca le doy un orden natural por String//lo ordeno alfabeticamente.
@Override
public int compareTo(Clientes o) {
	// TODO Auto-generated method stub
	return this.getNombre().compareTo(o.getNombre());
}


}


