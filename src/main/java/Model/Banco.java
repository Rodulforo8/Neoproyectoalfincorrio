package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//MAPEO DE LOS DATOS DE LA CLASE BANCO A LA BASE DE DATOS POSTGRESQL
	
@Entity
@Table(name= "Banco")
public class Banco
{
//ANOTACION DE COLUMNAS
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
@Column (name="id")
private int neobancoId; 

@Column (name="nombre_banco")
private String nombre_banco;

@Column (name="direccion")
private String direccion;


@Column (name="rif")
private String rif;

@Column (name="telefono")
private String telefono;

@Column (name="correo")
private String correo;

//Metodos setters y getters
public  Banco(){}

//CONSTRUCTOR
public Banco(String nombre_banco, String direccion, String rif, String telefono, String correo) {
	this.nombre_banco = nombre_banco;
	this.direccion = direccion;
	this.rif = rif;
	this.telefono = telefono;
	this.correo = correo;
}

//SETTERS Y GETTERS
public int getNeobancoId() {
	return neobancoId;
}


public void setNeobancoId(int neobancoId) {
	this.neobancoId = neobancoId;
}


public String getNombre_banco() {
	return nombre_banco;
}


public void setNombre_banco(String nombre_banco) {
	this.nombre_banco = nombre_banco;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public String getRif() {
	return rif;
}


public void setRif(String rif) {
	this.rif = rif;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("nombre:%s, direccion: %s, telefono: %s", nombre_banco, direccion, telefono);
	}


}

