
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MonoalphabeticCypher s = new MonoalphabeticCypher();
		//String plaint = "our group are sultan + khalid + abdulmajeed";
		
		//System.out.println("Plaint text: " + plaint);
		//System.out.println("Encrypted text: " +s.stringEncryption(plaint));
		
		
		PlayFairCipher pf = new PlayFairCipher();
		
		char[] str = new char[30];
		char[] key = new char[30];
		
		//str=pf.strcpy(str, plaint);
		
		
		//pf.encryptByPlayfairCipher(str, key);
		pf.strcpy(key, "Monarchy");
		System.out.println("Key text: " + String.valueOf(key));
		pf.strcpy(str, "instruments");
		System.out.println("Plain text: " + String.valueOf(str));
		pf.encryptByPlayfairCipher(str, key);
		System.out.println("Cipher text: " + String.valueOf(str));
		
	}

}
