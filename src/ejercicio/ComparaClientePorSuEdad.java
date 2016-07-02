package ejercicio;

import java.util.*;

public class ComparaClientePorSuEdad implements Comparator<Clientes> {

	
	@Override
	public int compare(Clientes o1, Clientes o2) {
		// TODO Auto-generated method stub
		Integer cli1=o1.getEdad();
		Integer cli2=o2.getEdad();
		 
		return cli1.compareTo(cli2);
	}
}
