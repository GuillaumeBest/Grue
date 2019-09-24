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
		    //Lecture des donn�es
		    while((i = fr.read()) != -1)
		      str += (char)i;

		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
		
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
	public String creeCle() {
		String key = "";
		return key;
	}
}
