import java.util.Scanner;

public class Keyed_Transposition_bits {
	private boolean unique(String digit) {

		for (int i = 0; i < digit.length(); i++) {
			for (int j = i + 1; j < digit.length(); j++) {
				if (digit.charAt(i) == digit.charAt(j)) {
					System.out.println("digits can't be equal " + digit.charAt(i) + " : " + digit.charAt(j));
					return false;

				}
			}
		}
		for(int i=0;i<digit.length();i++) {
			int ss = digit.charAt(i);
			if( ss>3&&ss<0)
				return false;
			
		}

		return true;
	}

	private void encrpyt(String plaintext, int[] key) {
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

	
	public void encrypt(String str,String digit  ) {
		


		while (str.length() % 4 != 0) {
			str += "z";

		}
		int num = Integer.parseInt(digit);
		int key[] = new int[4];

		for (int i = 3; i > -1; i--) {
			key[i] = num % 10;
			num = num / 10;
		}

		String result = "";
		char[] messChar = str.toCharArray();

		for (int i = 0; i < messChar.length; i++) {
			
			result += Integer.toBinaryString(messChar[i])+" ";
		}
		encrpyt(result, key);
	}

}
