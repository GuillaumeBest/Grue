package max;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String sampleString = "sucepute"; 
	  
    // Encrypt the string 
    System.out.println("Encrypted String");
    
    // static donc accès à l'objet grâce au nom de  la classe 
    String encryptedString = encryptDecrypt.encryptDecrypt(sampleString); 

    // Decrypt the string 
    System.out.println("Decrypted String"); 
    
   encryptDecrypt.encryptDecrypt(encryptedString); 
	
}
}