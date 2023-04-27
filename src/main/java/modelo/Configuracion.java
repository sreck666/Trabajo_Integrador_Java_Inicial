package modelo;

public class Configuracion {

	

	private String PronosticoCSV;
	private String PronosticoSQL;
	private String PartidosCSV;
	private int PuntosxAcierto;
	private String DRVCadena;

	public Configuracion() { }
	
//	public Configuracion(String PronosticoCSV, String PronosticoSQL, String PartidosCSV, int PuntosxAcierto, String DRVCadena) {
//	    this.PronosticoCSV = PronosticoCSV;
//	    this.PartidosCSV = PartidosCSV;
//	    this.DRVCadena = DRVCadena;
//	    this.PuntosxAcierto = PuntosxAcierto;
//	}

	public String getPronosticoCSV() {
		return PronosticoCSV;
	}

	public String getPronosticoSQL() {
		return PronosticoSQL;
	}

	public String getPartidosCSV() {
		return PartidosCSV;
	}

	public int getPuntosxAcierto() {
		return PuntosxAcierto;
	}



	public String getDRVCadena() {
		return DRVCadena;
	}

	public void setPronosticoCSV(String pronosticoCSV) {
		PronosticoCSV = pronosticoCSV;
	}

	public void setPronosticoSQL(String pronosticoSQL) {
		PronosticoSQL = pronosticoSQL;
	}

	public void setPartidosCSV(String partidosCSV) {
		PartidosCSV = partidosCSV;
	}

	public void setPuntosxAcierto(int puntosxAcierto) {
		PuntosxAcierto = puntosxAcierto;
	}





	public void setDRVCadena(String dRVCadena) {
		DRVCadena = dRVCadena;
	}
	    

	

}
