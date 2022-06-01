package com.conversor.listaOption;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Categoria{
	public void categoria() {
	 try {
			Object listaEscoger = JOptionPane.showInputDialog(null, "seleccione una opcion",
					"Menu",   JOptionPane.QUESTION_MESSAGE, null,new String[] 
							{"Conversor por moneda","Conversor por temperatura"}, "categoria 3");
			if(listaEscoger=="Conversor por moneda") {
				conversionPorMoneda moneda = new conversionPorMoneda();
				moneda.moneda();
			}else if(listaEscoger=="Conversor por moneda") {
				
			}
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
