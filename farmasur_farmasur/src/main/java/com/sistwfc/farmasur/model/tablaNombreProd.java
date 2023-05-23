package com.sistwfc.farmasur.model;

public class tablaNombreProd {
	private Integer Id_Nom;
	private String NombreProd;
	
	public tablaNombreProd() {
		// Constructor vacio
	}
	
	public tablaNombreProd(Integer id_Nom, String nombreProd) {
		super();
		Id_Nom = id_Nom;
		NombreProd = nombreProd;
	}

	public Integer getId_Nom() {
		return Id_Nom;
	}

	public void setId_Nom(Integer id_Nom) {
		Id_Nom = id_Nom;
	}

	public String getNombreProd() {
		return NombreProd;
	}

	public void setNombreProd(String nombreProd) {
		NombreProd = nombreProd;
	}

	@Override
	public String toString() {
		return "tablaNombreProd [Id_Nom=" + Id_Nom + ", NombreProd=" + NombreProd + "]";
	}
}
