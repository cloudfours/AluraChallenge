package com.conversor.listaOption;

import javax.swing.JOptionPane;

public class ConversionPorTemperatura {
	DeseaContinuar continuar = new DeseaContinuar();
	public void temperatura() {
	float resultado;
		Object converTemp = JOptionPane.showInputDialog(null, "seleccione una opcion", "Menu",
				JOptionPane.QUESTION_MESSAGE, null,
				new String[] { "Kelvin", "Grado Farenheit", "Grado Celcius" },
				"categoria 3");
		if (converTemp == "Kelvin") {
			entradaDatos datos = new entradaDatos();
			 resultado = (float) ((float) datos.datos() - 273.15)*9/5+32;
			JOptionPane.showMessageDialog(null,"Kelvin: "+ resultado);
			continuar.continuar();
		} else if (converTemp == "Grado Farenheit") {
			entradaDatos datos = new entradaDatos();
			 resultado = (float) ((float) ((datos.datos()) - 32)*5/9+273.15);
			JOptionPane.showMessageDialog(null,"Grado Farenheit: "+ resultado);
			continuar.continuar();
		}else if (converTemp == "Grado Celcius") {
			entradaDatos datos = new entradaDatos();
			 resultado = (float) ((datos.datos()) + 273.15);
			JOptionPane.showMessageDialog(null,"Grados Celcius:  "+ resultado);
			continuar.continuar();
		}

	}
}
