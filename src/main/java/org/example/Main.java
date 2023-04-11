package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.*;
import java.util.HashMap;

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


		List<Resultado> listaDeResultados = new ArrayList<>();
		List<Pronostico> listaDePronostico = new ArrayList<>();
		


		//----- Leemos el Archivo de los resultados de los partidos  
		try {
			//listaDeResultados = new CsvToBeanBuilder(new FileReader(args[0]))
			listaDeResultados = new CsvToBeanBuilder<Resultado>(new FileReader("D:\\develop\\Java\\TrabajoPractico\\src\\main\\resources\\partidos.csv"))
					.withSkipLines(1)
					.withSeparator(';')
					.withType(Resultado.class)
					.build()
					.parse();

			

		} catch (IOException ex) { 
			System.err.println("Erorr al leer el archivo");
			ex.printStackTrace(); }



		//--------------------------------------------------------------------------------------------------------------------------        

		try {
			listaDePronostico = new CsvToBeanBuilder(new FileReader("D:\\develop\\Java\\TrabajoPractico\\src\\main\\resources\\pronostico.csv"))
					.withSkipLines(1)
					.withSeparator(';')
					.withType(Pronostico.class)
					.build()
					.parse();


		} catch (IOException ex) {
			System.err.println("Error al leer el archivo");
			ex.printStackTrace();  }
		
		
		//---------------------------------------------------------------------------------------------------

		HashMap<String, Integer> hashMapPronostico = new HashMap<>();
		
		int i = 0;
		int nVal = 0;
		
		
		for (Pronostico pronostico: listaDePronostico){
			
		
			if (hashMapPronostico.containsKey(pronostico.getplayer())) {
	            //nVal = hashMapPronostico.get(pronostico.getplayer()) + 1;
	            //hashMapPronostico.put(pronostico.getplayer(), nVal);
				
	        } else {
	        	hashMapPronostico.put(pronostico.getplayer(), 0);
	        	i = 0;
	        }
			
			if (listaDeResultados.get(i).getGanador().equalsIgnoreCase(pronostico.getPronostico())) {
	            nVal = hashMapPronostico.get(pronostico.getplayer());
	            nVal = nVal + 1;
	            hashMapPronostico.put(pronostico.getplayer(), nVal);
			} else {
				//System.out.println("no");
			}
			
			i = i + 1;
			
			
		}
		
				
		for (HashMap.Entry<String, Integer> entry : hashMapPronostico.entrySet()) {
            System.out.printf("Jugador: %s.  \t  Puntuacion: %d\n", entry.getKey(), entry.getValue());
        }

	

	}
	


}




