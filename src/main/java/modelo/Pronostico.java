package modelo;


import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class Pronostico {
	
	@CsvBindByPosition(position = 0)
    private String nom_player;
    
    @CsvBindByPosition(position = 1)
    private String proEquipo1;
    
    @CsvBindByPosition(position = 2)
    private char okEquipo1;
    
    @CsvBindByPosition(position = 3)
    private char empate;
    
    @CsvBindByPosition(position = 4)
    private char okEquipo2;
    
    @CsvBindByPosition(position = 5)
    private String proEquipo2;

    
	public String getNom_player() {
		return nom_player;
	}

	public void setNom_player(String nom_player) {
		this.nom_player = nom_player;
	}

	public String getProEquipo1() {
		return proEquipo1;
	}

	public void setProEquipo1(String proEquipo1) {
		this.proEquipo1 = proEquipo1;
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

	public String getProEquipo2() {
		return proEquipo2;
	}

	public void setProEquipo2(String proEquipo2) {
		this.proEquipo2 = proEquipo2;
	}


}

