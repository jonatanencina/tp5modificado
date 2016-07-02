package ejercicio;

import ejercicio.BarHomeroo;

import ejercicio.Clientes;

import ejercicio.ComparaClientePorSuEdad;
import junit.framework.Assert;

import org.junit.Test; 

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet; 

public class TestBarHomero {

       @Test
       public void BarAbiertoSinClientes(){
    	   
    	   BarHomeroo mibar=new BarHomeroo();
    	   
    	   
    	   assertEquals(0,mibar.listaDeClientes.size(),0.01);
    	   
       }
       //aca ordeno los objetos alfabeticamente y piso los objetos repetidos por el nombre
     @Test
    public void  BarAbiertoConClientesOrdenadosAlfabeticamente(){
    	 
    	 BarHomeroo mibar=new BarHomeroo();
 		
 		mibar.agregarClientes(new Clientes("jonatan",22));
 		
 		mibar.agregarClientes(new Clientes("Ana Peres",25));
 		
 		mibar.agregarClientes(new Clientes("lucia garcia",23));
 		
 		mibar.agregarClientes(new Clientes("Florencia  lopes",20));
 		
 		mibar.agregarClientes(new Clientes("jonatan",24));
 		
 		System.out.println("aca se muestran ordenados alfabeticamente");
 		
 		for(Clientes corre: mibar.listaDeClientes  )
 		{
 			
 			System.out.println(" nombre "+corre.getNombre()+" edad "+ corre.getEdad());
 		
 		}//agrego 5 elementos ala coleccion  y solo se agregan 4 por que uno esta repetido
 		
 		assertEquals(4,mibar.listaDeClientes.size(),0.01);
 		
 		
    	 
    	  }
      @Test
      public void BarAbiertoConClientesOrdenadosPorEdad(){
    	
    	  BarHomeroo mibar=new BarHomeroo();
     	 
    	  Clientes cli1=new Clientes(" patricio wozniak",21);
     	 
     	 Clientes cli2=new  Clientes("bruno coronado",24);
     	 
     	Clientes cli3=new Clientes("Ana Maria",23);		 
     	
     	Clientes cli4=new Clientes("Josefina Flores",22);
     	

     	
     	 mibar.agregarClientes(cli1);
     	 
     	 mibar.agregarClientes(cli2);
     	 
     	 mibar.agregarClientes(cli3);
     	  
     	 mibar.agregarClientes(cli4);
     	 
     	 TreeSet<Clientes> listaEsperada=new TreeSet<Clientes>();
     	 
     	listaEsperada.add(cli1);
     	listaEsperada.add(cli2);
     	listaEsperada.add(cli3);
     	listaEsperada.add(cli4);
     	
     	System.out.println("\n aca se muestran ordenados por edad\n");
     	
     	assertEquals(listaEsperada,mibar.comparandoLosClientesPorEdad());

      }
      @Test 
      public void comparandoClientesAdentroYAfueraDelBar(){
    	  
    	  BarHomeroo mibar=new BarHomeroo();
    	  
    	  mibar.agregarClientes(new Clientes("jonatan",22));
    	  
    	  mibar.agregarClientes(new Clientes("arjona ",31));
    	  
    	  mibar.agregarClientes(new Clientes("florencia",25));
    	  
    	  mibar.agregarClientes(new Clientes("estefania",31));
    	  
    	  
    	  
    	  Clientes cli=new Clientes("jonatan",22);
    	  
    	  
            //aca me fijo si un cliente afuera del  bar se llama igual que uno de adentro del bar       
   		  assertTrue( mibar.ComparandoClientesAdentroYAfuera(mibar, cli)==true);               
    	  
   		
   			                               }	
   			
                          
      }
	
    	  
      
      
      



