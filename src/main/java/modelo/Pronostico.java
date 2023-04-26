package modelo;
import com.opencsv.bean.CsvBindByPosition;


public class Pronostico {
	
	public Pronostico() { }
	
	public Pronostico(String player, String Equipo1, String okEquipo1, String empate, String okEquipo2, String Equipo2) {
		this.player = player;
		this.Equipo1 = Equipo1;
		this.okEquipo1 = okEquipo1;
		this.empate = empate;
		this.okEquipo2 = okEquipo2;
		this.Equipo2 = Equipo2;
	}
	
	
	@CsvBindByPosition(position = 0)
    private String player;
    
    @CsvBindByPosition(position = 1)
    private String Equipo1;
    
    @CsvBindByPosition(position = 2)
    private String okEquipo1;
    
    @CsvBindByPosition(position = 3)
    private String empate;
    
    @CsvBindByPosition(position = 4)
    private String okEquipo2;
    
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

	public String getOkEquipo1() {
		return okEquipo1;
	}

	public void setOkEquipo1(String okEquipo1) {
		this.okEquipo1 = okEquipo1;
	}

	public String getEmpate() {
		return empate;
	}

	public void setEmpate(String empate) {
		this.empate = empate;
	}

	public String getOkEquipo2() {
		return okEquipo2;
	}

	public void setOkEquipo2(String okEquipo2) {
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
		
		if (this.okEquipo1.equals("X")) {
     		ganador = this.Equipo1; 
     	} else if (this.okEquipo2.equals("X")) {
     		ganador = this.Equipo2;
     	} 
		
		return ganador.trim();
	}
	

	

}

