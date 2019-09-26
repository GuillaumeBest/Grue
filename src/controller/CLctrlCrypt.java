package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CLctrlCrypt {
	public void ecrireUnFichier(String path, String texte, boolean replace) {
	    try {
			PrintWriter writer = new PrintWriter(new FileWriter(path, replace));
			writer.print(texte);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

	}
	public String lireFichierSimple(String path, int lgLecture) {
		FileReader fr;
		String str = null;
		try {
			fr = new FileReader(path);
		    str = "";
		    int i = 0;
		    //Lecture des donn�es
		    while((i = fr.read()) != -1 && str.length() <= lgLecture)
		      str += (char)i;
		   
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
		
	}
	public void lireLigne(String path) {
		FileReader fr;
		String str = null;
		char chr;
		String reponse;
		reponse = this.lireFichierSimple("b.txt", 12); //lit les 12 premiers cara du fichier crypter
		try {
			fr = new FileReader(path);
		    str = "";
		    int i = 0;
		    //Lecture des donn�es
		    while((i = fr.read()) != -1) {
		    	chr = (char)i;
		    	if (i == 10) {
		    		this.testerCle(str, reponse);
		    		str = "";
		    	}else {
		    		str += (char)i;
		    	}
		      
		    }
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void testerCle(String key, String reponse) {
		
		reponse = this.crypter(reponse, key);
		//appeler la fct de verification
		//this.ecrireUnFichier(key + ".txt", reponse, false);
		
	}
	public String crypter(String inputString, String key) {
		 // Define XOR key 
        // Any character value will work 
        String xorKey = key; 
        // Define String to store encrypted/decrypted String 
        String outputString = ""; 
  
        // calculate length of input string 
        int len = inputString.length(); 
        int keyIndex = 0;
        // perform XOR operation of key 
        // with every character in string 
        
        for (int i = 0; i < len; i++)  
        { 
            outputString = outputString +  
            Character.toString((char) (inputString.charAt(i) ^ xorKey.charAt(keyIndex))); 
            
            keyIndex++;
            
            if (keyIndex >= xorKey.length()) {
            	keyIndex = 0;
            }
        } 
        return outputString; 
	}

	
	// The method that prints all possible strings of length k. 
	public void printAllKLength(char[] set, int k) 
	{ 
	    int n = set.length;  
	    printAllKLengthRec(set, "", n, k); 
	} 
	  
	// The main recursive method to print all possible strings of length k 
	static void printAllKLengthRec(char[] set, String prefix, int n, int k) {   
		CLctrlCrypt objet;
		objet = new CLctrlCrypt();
	    // Base case: k is 0, print prefix 
	    if (k == 0)  
	    { 
	        //System.out.println(prefix);
	        prefix = prefix + "\n";
	        objet.ecrireUnFichier("listeCle.txt", prefix, true); //appeler le service de cryptage et de comparaison
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
