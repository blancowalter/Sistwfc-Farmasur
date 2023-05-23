package com.sistwfc.farmasur.model;

public class tablaLaboratorios {
	private Integer Id_Lab;
	private String NombreLab;
	
	public tablaLaboratorios() {
		// Constructor vacio
	}
	
	private tablaProductos tablaproductos;
	
	public tablaLaboratorios(Integer id_Lab, String nombreLab) {
		super();
		Id_Lab = id_Lab;
		NombreLab = nombreLab;
	}

	public Integer getId_Lab() {
		return Id_Lab;
	}

	public void setId_Lab(Integer id_Lab) {
		Id_Lab = id_Lab;
	}

	public String getNombreLab() {
		return NombreLab;
	}

	public void setNombreLab(String nombreLab) {
		NombreLab = nombreLab;
	}
	
	

	public tablaProductos getTablaproductos() {
		return tablaproductos;
	}

	public void setTablaproductos(tablaProductos tablaproductos) {
		this.tablaproductos = tablaproductos;
	}

	@Override
	public String toString() {
		return "tablaLaboratorios [Id_Lab=" + Id_Lab + ", NombreLab=" + NombreLab + "]";
	}
	
}
