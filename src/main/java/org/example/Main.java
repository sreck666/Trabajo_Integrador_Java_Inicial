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
		//----- Leemos el Archivo de los pronosticos.
		try {
			//listaDePronostico = new CsvToBeanBuilder(new FileReader(args[1]))
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
		
		//----- recorremos pronostico y sumamos en el diccionario (hashmap) la  puntuacion de los participantes
		for (Pronostico pronostico: listaDePronostico){
			if (hashMapPronostico.containsKey(pronostico.getplayer())) {
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
		//----- Imprimimos los resultados
		for (HashMap.Entry<String, Integer> entry : hashMapPronostico.entrySet()) {
            System.out.printf("Jugador: %s.  \t  Puntuacion: %d\n", entry.getKey(), entry.getValue());
        }
	}
}





