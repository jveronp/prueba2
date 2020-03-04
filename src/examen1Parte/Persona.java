package examen1Parte;

public class Persona {
private int DNI;
private String nombre;

public Persona(int dNI, String nombre) {
	super();
	DNI = dNI;
	this.nombre = nombre;
}

public int getDNI() {
	return DNI;
}

public void setDNI(int dNI) {
	DNI = dNI;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public String toString() {
	return "Persona [DNI=" + DNI + ", nombre=" + nombre + "]";
}




}
