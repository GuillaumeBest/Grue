package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CLctrlCrypt {
	public void ecrireUnFichier(String path, String texte) {
	    try {
			PrintWriter writer = new PrintWriter(new FileWriter(path, false));
			writer.print(texte);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

	}
	public String lireFichierSimple(String path) {
		FileReader fr;
		String str = null;
		try {
			fr = new FileReader(path);
		    str = "";
		    int i = 0;
		    //Lecture des données
		    while((i = fr.read()) != -1)
		      str += (char)i;

		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
		
	}
	public String crypter(String texte, String Key) {
		return Key;
		
	}
}
