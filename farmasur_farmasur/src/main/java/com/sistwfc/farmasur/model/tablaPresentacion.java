package com.sistwfc.farmasur.model;

public class tablaPresentacion {
	private Integer Id_Pre;
	private String Presentacion;
	
	public tablaPresentacion() {
		// Constructor vacio.
	}
	

	public tablaPresentacion(Integer id_Pre, String presentacion) {
		super();
		Id_Pre = id_Pre;
		Presentacion = presentacion;
	}



	public Integer getId_Pre() {
		return Id_Pre;
	}

	public void setId_Pre(Integer id_Pre) {
		Id_Pre = id_Pre;
	}

	public String getPresentacion() {
		return Presentacion;
	}

	public void setPresentacion(String presentacion) {
		Presentacion = presentacion;
	}
	
	@Override
	public String toString() {
		return "tablaPresentacion [Id_Pre=" + Id_Pre + ", Presentacion=" + Presentacion + "]";
	}
	
}
