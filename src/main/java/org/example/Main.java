package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.*;
import java.util.Hashtable;

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
		List<Pronostico> listaDeResultadosForm = new ArrayList<>();
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





		int i = 0;

		for (Resultado resultado : listaDeResultados) {
			resultado.myPublicMethod();
		}



		
		
		
		
		
		
		
		
		
		


		//--------------------------------------------------------------------------------------------------------------------------        



		try {
			listaDePronostico = new CsvToBeanBuilder(new FileReader("D:\\develop\\Java\\TrabajoPractico\\src\\main\\resources\\pronostico.csv"))
					.withSkipLines(1)
					.withSeparator(';')
					.withType(Pronostico.class)
					.build()
					.parse();





			for (Pronostico pronostico: listaDePronostico){
				pronostico.myPublicMethod_2();
				pronostico.mymy();
			}




		} catch (IOException ex) {
			System.err.println("Error al leer el archivo");
			ex.printStackTrace();  }
		//---------------------------------------------------------------------------------------------------



	

	}

}




