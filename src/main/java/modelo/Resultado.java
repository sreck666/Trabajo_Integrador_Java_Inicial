package modelo;


import com.opencsv.bean.CsvBindByPosition;



public class Resultado {
	
	public Resultado() {}
	
	
	
    @CsvBindByPosition(position = 0)
    private String grupo;
	
    @CsvBindByPosition(position = 1)
    private String equipo1;
    
    @CsvBindByPosition(position = 2)
    private Integer golEquipo1;
    
    @CsvBindByPosition(position = 3)
    private Integer golEquipo2;
    
    @CsvBindByPosition(position = 4)
    private String equipo2;
    
    

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public Integer getGolEquipo1() {
		return golEquipo1;
	}

	public void setGolEquipo1(Integer golEquipo1) {
		this.golEquipo1 = golEquipo1;
	}

	public Integer getGolEquipo2() {
		return golEquipo2;
	}

	public void setGolEquipo2(Integer golEquipo2) {
		this.golEquipo2 = golEquipo2;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
    
	
	public String getGanador() {
		
		String ganador = "empate";
		
		if (this.golEquipo1 > this.golEquipo2) {
     		ganador = this.equipo1; 
     	} else if (this.golEquipo1 < this.golEquipo2) {
     		ganador = this.equipo2;
     	} 
		//System.out.println(ganador);
		
		return ganador.trim();
		
	  } 
    
}
