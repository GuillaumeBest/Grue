package max;
public class encryptDecrypt 
{ 
    // The same function is used to encrypt and 
    // decrypt 
    static String encryptDecrypt(String inputString) 
    { 
        // Define XOR key 
        // Any character value will work 
        String xorKey = "123"; 
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
  
        System.out.println(outputString); 
        return outputString; 
    } }
