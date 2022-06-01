package com.conversor.listaOption;

import javax.swing.JOptionPane;

public class ConversionPorTemperatura {
	DeseaContinuar continuar = new DeseaContinuar();
	public void temperatura() {
		Object converMoneda = JOptionPane.showInputDialog(null, "seleccione una opcion", "Menu",
				JOptionPane.QUESTION_MESSAGE, null,
				new String[] { "De pesos a Dolar", "De pesos a Euro", "De pesos a Libras", "De pesos a Yen",
						"De pesos a Won Coreano", "De dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos" },
				"categoria 3");
		if (converMoneda == "De pesos a Dolar") {
			entradaDatos datos = new entradaDatos();
			float resultado = (float) ((float) datos.datos() * 3976.49);
			JOptionPane.showMessageDialog(null, resultado);
			continuar.continuar();
		} else if (converMoneda == "De pesos a Euro") {
			entradaDatos datos = new entradaDatos();
			float resultado = (float) ((datos.datos()) * 4235.04);
			JOptionPane.showMessageDialog(null, resultado);
			continuar.continuar();
		}else if (converMoneda == "De pesos a Libras") {
			entradaDatos datos = new entradaDatos();
			float resultado = (float) ((datos.datos()) *4965.18);
			JOptionPane.showMessageDialog(null, resultado);
			continuar.continuar();
		}else if (converMoneda == "De pesos a Yen") {
			entradaDatos datos = new entradaDatos();
			float resultado = (float) ((datos.datos()) * 30.55);
			JOptionPane.showMessageDialog(null, resultado);
			continuar.continuar();
		}else if (converMoneda == "De pesos a Won Coreano") {
			entradaDatos datos = new entradaDatos();
			float resultado = (float) ((datos.datos()) * 3.19);
			JOptionPane.showMessageDialog(null, resultado);
			continuar.continuar();
		}else if (converMoneda == "De dolar a Pesos") {
			entradaDatos datos = new entradaDatos();
			float resultado = (float) ((datos.datos()) * 3976.50);
			JOptionPane.showMessageDialog(null, resultado);
			continuar.continuar();
		}else if (converMoneda == "De Euro a Pesos") {
			entradaDatos datos = new entradaDatos();
			float resultado = (float) ((datos.datos()) * 4236.40);
			JOptionPane.showMessageDialog(null, resultado);
			continuar.continuar();
		}else if (converMoneda == "De Libras a Pesos") {
			entradaDatos datos = new entradaDatos();
			float resultado = (float) ((datos.datos()) * 4965.85);
			JOptionPane.showMessageDialog(null, resultado);
			continuar.continuar();
		}

	}
}
