package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.*;

import com.opencsv.bean.CsvToBeanBuilder;

import modelo.Pronostico;
import modelo.Resultado;



public class Main {
    public static void main(String[] args) {
        //En la variable args va a viajar la ruta del archivo que queremos que abra el programa
//        if(args.length == 0){
//            System.out.println("ERROR: No se Ingreso el archivo del resultado de los partidos");
//            System.exit(88);
//        }


        List<Resultado> listaDeResultados = null;
        List<Pronostico> listaDePronostico = null;
    	String ganador="";
        
        try {
             //listaDeResultados = new CsvToBeanBuilder(new FileReader(args[0]))
        	listaDeResultados = new CsvToBeanBuilder(new FileReader("D:\\develop\\Java\\TrabajoPractico\\src\\main\\resources\\partidos.csv"))
            		 .withSkipLines(1)
                     .withSeparator(';')
                     .withType(Resultado.class)
                     .build()
                     .parse();

        	
        	
            for (Resultado resultado : listaDeResultados) {
	             	if (resultado.getGolEquipo1() > resultado.getGolEquipo2()) {
	             		ganador = resultado.getEquipo1(); 
	             	} else if (resultado.getGolEquipo1() < resultado.getGolEquipo2()) {
	             		ganador = resultado.getEquipo2();
	             	} else {
	             		ganador = "Empate"; 
	             	}
	        System.out.println("El ganador del partido es " + ganador);				
            }
             
             	
            } catch (IOException e) { 
            	System.err.println("Erorr al leer el archivo");
            	e.printStackTrace(); }

        
        //--------------------------------------------------------------------------------------------------------------------------        
        
        
        
        try {
        	listaDePronostico = new CsvToBeanBuilder(new FileReader("D:\\develop\\Java\\TrabajoPractico\\src\\main\\resources\\pronostico.csv"))
	           		 .withSkipLines(1)
	                 .withSeparator(';')
                     .withType(Pronostico.class)
                     .build()
                     .parse();
        	   
        	
            for (Pronostico pronostico: listaDePronostico){
            	 for (Resultado resultado : listaDeResultados) {
 	             	if (resultado.getGolEquipo1() > resultado.getGolEquipo2()) {
 	             		ganador = resultado.getEquipo1(); 
 	             	} else if (resultado.getGolEquipo1() < resultado.getGolEquipo2()) {
 	             		ganador = resultado.getEquipo2();
 	             	} else {
 	             		ganador = "Empate"; 
 	             	}
 	        System.out.println("El ganador del partido es " + ganador);				
             }
            	System.out.println(
                           "Estado de la suscripción: " + pronostico.getNom_player() + "\n" +
                                   "Fecha de Alta: " + pronostico.getProEquipo1()  + "\n" +
                                   "Precio de la suscripción " + pronostico.getOkEquipo1()  + "\n" +
                                   "Id Servicio suscripto: " + pronostico.getEmpate() + "\n" +
                                   "Id Servicio suscripto: " + pronostico.getOkEquipo2()  + "\n" +
                                   "Nombre Servicio suscripto: " + pronostico.getProEquipo2()  + "\n" +
                                   "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"  );
            	}
             	
            } catch (IOException e) {
            	System.err.println("Error al leer el archivo");
            	e.printStackTrace();  }
        //---------------------------------------------------------------------------------------------------
        
        
 
        
        
        

    }
}




