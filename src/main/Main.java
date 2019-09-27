package main;

import contract.IController;
import contract.IModel;
import contract.IView;
import controller.Controller;
import model.CLcrypt;
import model.CLfichier;
import model.Model;
import view.View;

public class Main {

	public static void main(String[] args) {
//
		final IModel model = new Model();
		final IView view = new View();
		final IController controler = new Controller(model, view);
//		controler.loadDatas();
//		controler.launchApplication();
		CLcrypt oCrypt =new CLcrypt();
		CLfichier oFichier = new CLfichier();
		String reponse;
		
		reponse = oCrypt.decrypt("Je suis une belle phrase", "bc");
		oFichier.setData("Encrypt_zx.txt", reponse, false);
		
	}
}
