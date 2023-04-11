package modelo;
import java.util.Hashtable;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;


public class Pronostico {
	
	@CsvBindByPosition(position = 0)
    private String player;
    
    @CsvBindByPosition(position = 1)
    private String Equipo1;
    
    @CsvBindByPosition(position = 2)
    private char okEquipo1;
    
    @CsvBindByPosition(position = 3)
    private char empate;
    
    @CsvBindByPosition(position = 4)
    private char okEquipo2;
    
    @CsvBindByPosition(position = 5)
    private String Equipo2;

    
	public String getplayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getEquipo1() {
		return Equipo1;
	}

	public void setEquipo1(String Equipo1) {
		this.Equipo1 = Equipo1;
	}

	public char getOkEquipo1() {
		return okEquipo1;
	}

	public void setOkEquipo1(char okEquipo1) {
		this.okEquipo1 = okEquipo1;
	}

	public char getEmpate() {
		return empate;
	}

	public void setEmpate(char empate) {
		this.empate = empate;
	}

	public char getOkEquipo2() {
		return okEquipo2;
	}

	public void setOkEquipo2(char okEquipo2) {
		this.okEquipo2 = okEquipo2;
	}

	public String getEquipo2() {
		return Equipo2;
	}

	public void setquipo2(String Equipo2) {
		this.Equipo2 = Equipo2;
	}
	
	public String getPronostico() {
		
		String ganador = "empate";
		
		if (this.okEquipo1 == 'X' ) {
     		ganador = this.Equipo1; 
     	} else if (this.okEquipo2 == 'X' ) {
     		ganador = this.Equipo2;
     	} 
		
		return ganador.trim();
		
		
	}
	

	

}

