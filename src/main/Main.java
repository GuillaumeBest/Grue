package main;

import contract.IController;
import contract.IModel;
import contract.IView;
import controller.CLctrlCrypt;
import controller.Controller;
import model.Model;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		final IModel model = new Model();
		final IView view = new View();
		final IController controler = new Controller(model, view);

		CLctrlCrypt o1;
		String reponse;
		
		o1 = new CLctrlCrypt();
		o1.ecrireUnFichier("C:\\Users\\remip\\Desktop\\fichier\\a.txt", "Bonjour a tous. Comment Allez vous?");
		
		reponse = o1.lireFichierSimple("C:\\Users\\remip\\Desktop\\fichier\\a.txt");
		System.out.println(reponse);
		
		reponse = o1.crypter(reponse, "adhyudertjutl");
		System.out.println(reponse);
		o1.ecrireUnFichier("C:\\Users\\remip\\Desktop\\fichier\\b.txt", reponse);
		
		reponse = o1.lireFichierSimple("C:\\Users\\Emmanuel\\Desktop\\fichier\\b.txt");
		reponse = o1.crypter(reponse, "adhyudertjutl");
		o1.ecrireUnFichier("C:\\Users\\remip\\Desktop\\fichier\\c.txt", reponse);
		System.out.println(reponse);
		
		System.out.println("Termin�");
		
		

		controler.loadDatas();
		controler.launchApplication();

	}
}