package model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CLfichier {
	public void setData(String path, String texte, boolean replace) {
	    try {
			PrintWriter writer = new PrintWriter(new FileWriter(path, replace));
			writer.print(texte);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

	}
	public String getData(String path, int lgLecture) {
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
}
