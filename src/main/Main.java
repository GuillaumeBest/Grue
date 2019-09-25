package main;

import contract.IController;
import contract.IModel;
import contract.IView;
import controller.CLctrlCrypt;
import controller.Controller;
import model.CLbdd;
import model.Model;
import view.View;

public class Main {

	public static void main(String[] args) {
//
//		final IModel model = new Model();
		final IView view = new View();
//		final IController controler = new Controller(model, view);
		
		CLbdd bdd = new CLbdd();
		
		
		
		CLctrlCrypt o1;
		String reponse;
		String key;
		o1 = new CLctrlCrypt();
		
	    System.out.println("First Test"); 
	    char[] set1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 
	    int nbrLettre = 2; 
	    o1.printAllKLength(set1, nbrLettre);
	    
		
		
		//o1.ecrireUnFichier("a.txt", "Je suis Niels", false);

		reponse = o1.lireFichierSimple("a.txt");
		System.out.println(reponse);

		reponse = o1.crypter(reponse, "za");
		//System.out.println(reponse);
		o1.ecrireUnFichier("b.txt", reponse, false);
		
		o1.lireLigne("listeCle.txt");
		
		reponse = o1.lireFichierSimple("b.txt");
		reponse = o1.crypter(reponse, "za");
		o1.ecrireUnFichier("c.txt", reponse, false);
		//System.out.println(reponse);

		System.out.println("Terminé");


//
//		controler.loadDatas();
//		controler.launchApplication();

	}
}
