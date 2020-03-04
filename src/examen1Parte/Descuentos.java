package examen1Parte;

import java.util.ArrayList;

public class Descuentos {

	public static float Hacienda(float IngBrAnual, float ingConyuge, 
								ArrayList<Integer> edadesHijos)
	{
		float porcentaje=0;
		
		if (IngBrAnual<8000) porcentaje=0;
		 else if (IngBrAnual<15000) porcentaje=12;
		 	else if (IngBrAnual<30000) porcentaje=17;
		 		else  porcentaje=25;
			

		if (ingConyuge>1500)	 porcentaje++;	
		
		for(int edad:  edadesHijos)
		{
			if (edad < 3 ) porcentaje= porcentaje-2;
			else if (edad < 25 ) porcentaje--;
		}
		
		if (porcentaje < 0 ) porcentaje = 0;
		if (porcentaje > 45 ) porcentaje = 45;		
		return porcentaje;		
	}
	
		public static float seguridadSocial(boolean esFijo)
	{
		float baseContingenciasComunes= (float) 4.60;
		float contratoTemporal= (float) 1.60;
		float contratoFijo= (float) 1.55;
		float fogasa= (float) 0.10;
		
		float porcentaje;
		
		if (esFijo) porcentaje=baseContingenciasComunes+contratoFijo+fogasa;
		else porcentaje=baseContingenciasComunes+contratoTemporal+fogasa;
		
		
		return porcentaje;			
	}	
}













