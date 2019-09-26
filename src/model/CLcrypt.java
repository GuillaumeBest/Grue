package model;

public class CLcrypt {
	public String decrypt(String data, String key) {
		 // Define XOR key 
       // Any character value will work 
       String xorKey = key; 
       // Define String to store encrypted/decrypted String 
       String outputString = ""; 
 
       // calculate length of input string 
       int len = data.length(); 
       int keyIndex = 0;
       // perform XOR operation of key 
       // with every character in string 
       
       for (int i = 0; i < len; i++)  
       { 
           outputString = outputString +  
           Character.toString((char) (data.charAt(i) ^ xorKey.charAt(keyIndex))); 
           
           keyIndex++;
           
           if (keyIndex >= xorKey.length()) {
           	keyIndex = 0;
           }
       } 
       return outputString; 
	}
}
