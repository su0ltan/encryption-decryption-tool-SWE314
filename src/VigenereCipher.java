public class VigenereCipher {
    private  String key;

    

    public VigenereCipher() {
		// TODO Auto-generated constructor stub
	}

	public String encrypt(String plaintext ,String key) {
        StringBuilder ciphertext = new StringBuilder();
        int keyIndex = 0;
        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                int shift = Character.toUpperCase(key.charAt(keyIndex)) - 'A';
                char encryptedChar = (char)(((Character.toUpperCase(c) - 'A' + shift) % 26) + 'A');
                ciphertext.append(encryptedChar);
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                ciphertext.append(c);
            }
        }
        return ciphertext.toString();
    }

    public String decrypt(String ciphertext , String key) {
        StringBuilder plaintext = new StringBuilder();
        int keyIndex = 0;
        for (char c : ciphertext.toCharArray()) {
            if (Character.isLetter(c)) {
                int shift = Character.toUpperCase(key.charAt(keyIndex)) - 'A';
                char decryptedChar = (char)(((Character.toUpperCase(c) - 'A' - shift + 26) % 26) + 'A');
                plaintext.append(decryptedChar);
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                plaintext.append(c);
            }
        }
        return plaintext.toString();
    }

	/*
	 * public static void main(String[] args) { String key = "HOUGHTON";
	 * VigenereCipher cipher = new VigenereCipher(key);
	 * 
	 * String plaintext = "MICHIGAN TECHNOLOGICAL UNIVERSITY"; String ciphertext =
	 * cipher.encrypt(plaintext); String decryptedText = cipher.decrypt(ciphertext);
	 * 
	 * System.out.println("Plaintext: " + plaintext);
	 * System.out.println("Ciphertext: " + ciphertext);
	 * System.out.println("Decrypted text: " + decryptedText); }
	 */
}