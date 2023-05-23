package com.sistwfc.farmasur.model;

public class tablaPrecios {
	private Integer Id_Precio;
	private Double PrecioComp;
	private Integer RecPorcent;
	private Double Recargo;
	private Double PrePVP;
	
	public tablaPrecios() {
		// Constructor Vacio
	}
		
	public tablaPrecios(Integer id_Precio, Double precioComp, Integer recPorcent, Double recargo, Double prePVP) {
		super();
		Id_Precio = id_Precio;
		PrecioComp = precioComp;
		RecPorcent = recPorcent;
		Recargo = recargo;
		PrePVP = prePVP;
	}

	public Integer getId_Precio() {
		return Id_Precio;
	}
	public void setId_Precio(Integer id_Precio) {
		Id_Precio = id_Precio;
	}
	public Double getPrecioComp() {
		return PrecioComp;
	}
	public void setPrecioComp(Double precioComp) {
		PrecioComp = precioComp;
	}
	public Integer getRecPorcent() {
		return RecPorcent;
	}
	public void setRecPorcent(Integer recPorcent) {
		RecPorcent = recPorcent;
	}
	public Double getRecargo() {
		return Recargo;
	}
	public void setRecargo(Double recargo) {
		Recargo = recargo;
	}
	public Double getPrePVP() {
		return PrePVP;
	}
	public void setPrePVP(Double prePVP) {
		PrePVP = prePVP;
	}

	@Override
	public String toString() {
		return "tablaPrecios [Id_Precio=" + Id_Precio + ", PrecioComp=" + PrecioComp + ", RecPorcent=" + RecPorcent
				+ ", Recargo=" + Recargo + ", PrePVP=" + PrePVP + "]";
	}
}
