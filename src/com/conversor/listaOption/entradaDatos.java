package com.conversor.listaOption;

import javax.swing.JOptionPane;

public  class entradaDatos {
	public float datos() {
		try {
			float entrada = Float.valueOf(JOptionPane.showInputDialog("Ingrese valor para intercambio"));
			return entrada;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "valor incorrecto vuelva e ingrese");
		}
		return 0;

	}
}
