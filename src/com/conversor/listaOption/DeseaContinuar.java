package com.conversor.listaOption;

import javax.swing.JOptionPane;

public class DeseaContinuar {
	public void continuar() {
		int confirmar = JOptionPane.showConfirmDialog(null, "¿De desea continuar");
		if (JOptionPane.OK_OPTION == confirmar) {
			Categoria categoria = new Categoria();
			categoria.categoria();
		} else if (JOptionPane.NO_OPTION == confirmar) {
			JOptionPane.showMessageDialog(null, "Ha salido del programa");
		} else if (JOptionPane.CANCEL_OPTION == confirmar) {
			JOptionPane.showMessageDialog(null, "Ha salido del programa");
		}
	}
}
