package ejercicio;


import java.util.*;


public class BarHomeroo {
	//TreeSet<Clientes> listaDeClientes=new TreeSet<Clientes>();
	
	TreeSet<Clientes> listaDeClientes;
private	int cantidadDeClientes=0;
	
      public BarHomeroo( ){
		
		 listaDeClientes=new TreeSet<Clientes>();
	
	
	
	}
	public void agregarClientes(Clientes cliente){
		cantidadDeClientes++;
		listaDeClientes.add(cliente);
	}
	
	/**
	 * @return the listaDeClientes
	 */
	public TreeSet<Clientes> getListaDeClientes() {
		return listaDeClientes;
	}
	/**
	 * @param listaDeClientes the listaDeClientes to set
	 */
	public void setListaDeClientes(TreeSet<Clientes> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}
	public int getCantidadDeClientes(){
		
		return cantidadDeClientes;
	}
//aca lo comparo por la edad
public TreeSet comparandoLosClientesPorEdad(){
	
	ComparaClientePorSuEdad com_edad=new ComparaClientePorSuEdad();
	TreeSet<Clientes> orde_cliente=new TreeSet(com_edad);

	orde_cliente.addAll(listaDeClientes);
	
//	System.out.println(orde_cliente);
	for (Clientes clientes : orde_cliente) {
		
		System.out.println(clientes.getNombre()+clientes.getEdad());
	}
  	return orde_cliente;
}
//aca me fijo si un cliente que no esta en el bar es igual a otro que si lo esta.
public boolean ComparandoClientesAdentroYAfuera(BarHomeroo mibar,Clientes cliente){
	  
	int posicion=0;
	
	boolean igual = false;
	Iterator<Clientes> ITlistaDeClientes=mibar.listaDeClientes.iterator();
	
	
	
	
	while(ITlistaDeClientes.hasNext()){
  	  
  	 // ITlistaDeClientes.next();
  	  
  	 Clientes unaPersona = (Clientes) ITlistaDeClientes.next();
  	  
  	 String nom=unaPersona.getNombre();
  	 
  	 if(cliente.getNombre().equals(nom)){
  		 
  		 System.out.println(" El Cliente de afuera TIENE el mismo nombre que un cliente en el bar ");
  	    igual=true;
  	     
  	 }else{
  		 System.out.println("El Cliente de afuera NO TIENE el mismo nombre que un cliente en el bar");
  	    
  		 igual=false;
  	 }
  	 
                    
                  }
	 return igual;     
	
	
}
	
	
	
}





