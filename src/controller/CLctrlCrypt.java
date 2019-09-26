package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.CLcrypt;
import model.CLfichier;
import model.Map_Dic;
import model.StringCutter;

public class CLctrlCrypt {
	public boolean pcs_decrypter(String source_path, String destination_path) {
		System.out.println("ok");
		CLfichier oFichier;
		oFichier = new CLfichier();
		CLcrypt oCrypt;
		oCrypt = new CLcrypt();
		StringCutter sc;
		sc = new StringCutter();
		
		String[] tbStr;
		String strAdecrypt;
		String strDecrypt;
		int scoreCle;
		float scoreFinalCle;
		int nbrMot;
		FileReader fr;
		String str;
		char chr;
		boolean reponse = false;
		
		this.pcs_genererCle(2); //genere la liste des clés
		strAdecrypt = oFichier.getData(source_path, 20);
		try {
			fr = new FileReader("listeCle.txt");
		    str = "";
		    int i = 0;
		    //Boucle pour chaque clé
		    while((i = fr.read()) != -1) {
		    	scoreCle = 0;
		    	chr = (char)i;
		    	if (i == 10) {
		    		strDecrypt = oCrypt.decrypt(strAdecrypt, str);
		    		tbStr = sc.cutString(strDecrypt);
		    		nbrMot = tbStr.length;
		    		System.out.println("nbr mot : "+nbrMot);
		    		for(String strMot : tbStr) {
			    		if(Map_Dic.getInstance().selectWord(strMot) == 1) {
			    			scoreCle ++;
		    			}		    		
		    		}
		    		scoreFinalCle = nbrMot/scoreCle;
		    		System.out.println("Score Final : " + scoreFinalCle);
		    		if (scoreFinalCle > 0.8) {
		    			oFichier.setData("listeCleRetenu.txt", str, true);// on enregistre la clé dans une liste
		    			oFichier.setData(str + ".txt", strDecrypt, false); // On ecrit le resultat du decryptage dans un fochier au nom de la clé
		    			reponse = true;
		    		}

		    		str = "";
		    	}else {
		    		str += (char)i;
		    	}
		      
		    }
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reponse;
	}

	public void pcs_genererCle( int nbrLettre)
	{
	    char[] set1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 
	    this.printAllKLength(set1, nbrLettre);
	}
	// The method that prints all possible strings of length k. 
	public void printAllKLength(char[] set, int k) 
	{ 
	    int n = set.length;  
	    printAllKLengthRec(set, "", n, k); 
	} 
	  
	// The main recursive method to print all possible strings of length k 
	static void printAllKLengthRec(char[] set, String prefix, int n, int k) {   
		CLfichier oFichier;
		oFichier = new CLfichier();
	    // Base case: k is 0, print prefix 
	    if (k == 0)  
	    { 
	        //System.out.println(prefix);
	        prefix = "awqb" + prefix + "\n";
	        oFichier.setData("listeCle.txt", prefix, true); //appeler le service de cryptage et de comparaison
	        return; 
	    } 
	    // One by one add all characters from set and recursively call for k equals to k-1 
	    for (int i = 0; i < n; ++i) 
	    { 
	        // Next character of input added 
	        String newPrefix = prefix + set[i];  
	        // k is decreased, because  we have added a new character 
	        printAllKLengthRec(set, newPrefix, n, k - 1);  
	    } 
	} 
	
	
}
