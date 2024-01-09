package view;

import controller.Andorinha;
import controller.Baleia;
import controller.Morcego;
import controller.Nadadores;
import controller.Pinguim;
import controller.Voadores;

public class main {

	public static void main (String[] args) {
		Voadores andorinha = new Andorinha();
		andorinha.voar();
		
		Voadores morcego = new Morcego();
		morcego.voar();
		
		Nadadores baleia = new Baleia();
		baleia.nadar();
		
		Nadadores pinguim = new Pinguim();
		pinguim.nadar();
	}

}
