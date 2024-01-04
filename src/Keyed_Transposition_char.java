import java.util.Scanner;
 
public class Keyed_Transposition_char {
	private void encrypt(String plaintext, int[] key) {
		String encryptedMsg;
		char[] MsgBasedOnKey = new char[plaintext.length()];
		char[] Letters = plaintext.toCharArray();
		int i = 0;
		while (i < plaintext.length()) {
			MsgBasedOnKey[key[0] + i] = Letters[i + 0];
			MsgBasedOnKey[key[1] + i] = Letters[i + 1];
			MsgBasedOnKey[key[2] + i] = Letters[i + 2];
			MsgBasedOnKey[key[3] + i] = Letters[i + 3];
			i += 4;
		}

		System.out.print("The encrypted message is: ");
		System.out.println(MsgBasedOnKey);
		
	}
	public static boolean unique(String digit) {

		for (int i = 0; i < digit.length(); i++) {
			for (int j = i + 1; j < digit.length(); j++) {
				if (digit.charAt(i) == digit.charAt(j)) {
					System.out.println("digits can't be equal " + digit.charAt(i) + " : " + digit.charAt(j));
					return false;

				}
			}
		}
	
			return true;
	}

	
	
	public void encrypt(String plaintext , String digit) {
		
		
		int num = Integer.parseInt(digit);
		int key[] = new int[4];

		for (int i = 3; i > -1; i--) {
			key[i] = num % 10;
			num = num / 10;
		}
	
		
		while (plaintext.length() % 4 != 0) {
			plaintext += "z";

		}

		plaintext = plaintext.toLowerCase();
		encrypt(plaintext, key);

	}

}
