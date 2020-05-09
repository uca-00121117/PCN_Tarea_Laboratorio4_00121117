	package com.uca.capas.domain;
	
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(message = "El nombre no debe tener mas de 15 caracteres", max = 15)
	@NotEmpty(message = "Este campo no puede estar vacio")
	private String nombre;
	
	@Size(message = "El nombre no debe tener mas de 30 caracteres", max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	private String descripcion;
	
	@NotNull(message = "El campo no puede estar vacio")
	@Min(message = "El precio no debbe ser negativo", value = 0)
	private Double precio;
	
	@NotEmpty(message = "El campo no puede estar vacio")
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d$", message = "El formato debe ser dd/mm/aaaa")
	private String vencimiento;
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
	public Double getPrecio() {return precio;}
	public void setPrecio(Double precio) {this.precio = precio;}
	public String getVencimiento() {return vencimiento;}
	public void setVencimiento(String vencimiento) {this.vencimiento = vencimiento;}
}