import java.util.Scanner;

public class CombiningMonoalphabeticAndPlayfair {
	
	private MonoalphabeticCypher monoCipher;
	
	private PlayfairCipherDecryption playfairDecryption;
	private PlayfairEncryption playfairEncryption;
	private String cipherText;
	public PlayfairEncryption getPlayfairEncryption() {
		return playfairEncryption;
	}


	public String getCipherText() {
		return cipherText;
	}
	
	
	public CombiningMonoalphabeticAndPlayfair() {
		monoCipher = new MonoalphabeticCypher();
		playfairEncryption = new PlayfairEncryption();
		playfairDecryption = new PlayfairCipherDecryption();
		
	}
	
	
	public String encryptUsingMonoAlphabeticAndPlayfair(String PlaintText , String key) {
		
		
		cipherText = playfairEncryption.encryptUsingplayfair(PlaintText, key);
		System.out.println("after using playfair "+cipherText);
		cipherText = monoCipher.stringEncryption(cipherText.toLowerCase());
		System.out.println("after using mono "+cipherText);
		
		return cipherText;
		
		
	}
public String decryptUsingMonoAlphabeticAndPlayfair(String c , String key) {
	cipherText = monoCipher.stringDecryption(c.toUpperCase());
	playfairDecryption.setKey(key);
	playfairDecryption.KeyGen();
	cipherText = playfairDecryption.decryptMessage(cipherText);
	System.out.println(cipherText);
	
	
	
	
	return cipherText;
		
	}

}
