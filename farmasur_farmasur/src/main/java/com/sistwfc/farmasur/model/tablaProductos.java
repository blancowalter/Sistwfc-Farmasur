package com.sistwfc.farmasur.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKey;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tablaproductos")
public class tablaProductos implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer Id_Prod;
	private String troquel;
	private String Cod_Barras;
	private String Registro;
	private String PricActivo;
	private Integer id_nom;
	private Integer id_present;
	private Integer id_lab;
	private Integer id_Precio;
	
	public tablaProductos() {
		//
	}
	
	@OneToMany(mappedBy="Id_Precio")
	private List<tablaLaboratorios> tablalaboratorios;
	
	@OneToMany(mappedBy="id_present")
	private List<tablaPresentacion> tablapresentacion;
	
	
	public tablaProductos(Integer id_Prod, String troquel, String cod_Barras, String registro, String pricActivo,
			Integer id_nom, Integer id_present, Integer id_lab, Integer id_Precio) {
		super();
		Id_Prod = id_Prod;
		this.troquel = troquel;
		Cod_Barras = cod_Barras;
		Registro = registro;
		PricActivo = pricActivo;
		this.id_nom = id_nom;
		this.id_present = id_present;
		this.id_lab = id_lab;
		this.id_Precio = id_Precio;
	}

	public Integer getId_Prod() {
		return Id_Prod;
	}
	public void setId_Prod(Integer id_Prod) {
		Id_Prod = id_Prod;
	}
	public String getTroquel() {
		return troquel;
	}
	public void setTroquel(String troquel) {
		this.troquel = troquel;
	}
	public String getCod_Barras() {
		return Cod_Barras;
	}
	public void setCod_Barras(String cod_Barras) {
		Cod_Barras = cod_Barras;
	}
	public String getRegistro() {
		return Registro;
	}
	public void setRegistro(String registro) {
		Registro = registro;
	}
	public String getPricActivo() {
		return PricActivo;
	}
	public void setPricActivo(String pricActivo) {
		PricActivo = pricActivo;
	}
	public Integer getId_nom() {
		return id_nom;
	}
	public void setId_nom(Integer id_nom) {
		this.id_nom = id_nom;
	}
	public Integer getId_present() {
		return id_present;
	}
	public void setId_present(Integer id_present) {
		this.id_present = id_present;
	}
	public Integer getId_lab() {
		return id_lab;
	}
	public void setId_lab(Integer id_lab) {
		this.id_lab = id_lab;
	}
	public Integer getId_Precio() {
		return id_Precio;
	}
	public void setId_Precio(Integer id_Precio) {
		this.id_Precio = id_Precio;
	}

	public tablaProductos(Integer id_Prod, String troquel, String cod_Barras, String registro, String pricActivo,
			Integer id_nom, Integer id_present, Integer id_lab, Integer id_Precio,
			tablaPresentacion tablapresentacion) {
		super();
		Id_Prod = id_Prod;
		this.troquel = troquel;
		Cod_Barras = cod_Barras;
		Registro = registro;
		PricActivo = pricActivo;
		this.id_nom = id_nom;
		this.id_present = id_present;
		this.id_lab = id_lab;
		this.id_Precio = id_Precio;
		
	}



	public List<tablaLaboratorios> getTablalaboratorios() {
		return tablalaboratorios;
	}



	public void setTablalaboratorios(List<tablaLaboratorios> tablalaboratorios) {
		this.tablalaboratorios = tablalaboratorios;
	}

	public List<tablaPresentacion> getTablapresentacion() {
		return tablapresentacion;
	}

	public void setTablapresentacion(List<tablaPresentacion> tablapresentacion) {
		this.tablapresentacion = tablapresentacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
