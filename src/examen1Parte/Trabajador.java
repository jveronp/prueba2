package examen1Parte;

import java.util.ArrayList;

public class Trabajador extends Persona{

		private float retribucionNetaAnual;
		private boolean tieneConyuge;
		private float retribucionConyuge;
		private ArrayList<Integer> edadesHijos;
		
		public Trabajador(int dNI, String nombre, float retribucionNetaAnual, boolean tieneConyuge,
				float retribucionConyuge, ArrayList<Integer> edadesHijos) {
			super(dNI, nombre);
			this.retribucionNetaAnual = retribucionNetaAnual;
			this.tieneConyuge = tieneConyuge;
			this.retribucionConyuge = retribucionConyuge;
			this.edadesHijos = edadesHijos;
		}

		public Trabajador(int dNI, String nombre, float retribucionNetaAnual, boolean tieneConyuge,
				float retribucionConyuge) {
			super(dNI, nombre);
			this.retribucionNetaAnual = retribucionNetaAnual;
			this.tieneConyuge = tieneConyuge;
			this.retribucionConyuge = retribucionConyuge;
			edadesHijos = new ArrayList<Integer>();
		}
		
		public void anadirHijo(Integer edadHijo)
		{
			edadesHijos.add(edadHijo);
		}
		
		public int numeroHijos()
		{
			return edadesHijos.size();
		}
		
		

		public float getRetribucionNetaAnual() {
			return retribucionNetaAnual;
		}

		public void setRetribucionNetaAnual(float retribucionNetaAnual) {
			this.retribucionNetaAnual = retribucionNetaAnual;
		}

		public boolean isTieneConyuge() {
			return tieneConyuge;
		}

		public void setTieneConyuge(boolean tieneConyuge) {
			this.tieneConyuge = tieneConyuge;
		}

		public float getRetribucionConyuge() {
			return retribucionConyuge;
		}

		public void setRetribucionConyuge(float retribucionConyuge) {
			this.retribucionConyuge = retribucionConyuge;
		}

		public ArrayList<Integer> getEdadesHijos() {
			return edadesHijos;
		}

		public void setEdadesHijos(ArrayList<Integer> edadesHijos) {
			this.edadesHijos = edadesHijos;
		}

		@Override
		public String toString() {
			return "Trabajador [retribucionNetaAnual=" + retribucionNetaAnual + ", tieneConyuge=" + tieneConyuge
					+ ", retribucionConyuge=" + retribucionConyuge + ", edadesHijos=" + edadesHijos + "]";
		}
		
		
		
	
}
