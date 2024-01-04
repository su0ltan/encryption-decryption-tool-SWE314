import java.util.Arrays;

public class PlayfairDecryption implements PlayfairCipher {
	private String cipherText , key;
	private String plaintText;
	private char[][] x;
	
	public String decryptUsingplayfair(String pt , String k) {
		cipherText = pt;
		key  = k;
		cipherText.toLowerCase();
		
		//this step to remove any duplicate letters in key
		key = removeDuplicate(key);
		
	
		char[] ch = key.toCharArray();
	
		
		String st = "abcdefghiklmnopqrstuvwxyz";
		
		
		
		st = removeWhiteSpace(ch, st);	
		char[] c = st.toCharArray();
		
	      x = new char[5][5];
		
		int indexOfSt = 0, indexOfKey = 0; 
		
		for (int i = 0; i < 5; i++) {
			// this function to fill the matrix with key in first
			//then fill the remain alphabets letters

			for (int j = 0; j < 5; j++) {

				if (indexOfKey < key.length())

					x[i][j] = ch[indexOfKey++];

				else

					x[i][j] = c[indexOfSt++];
			}
		}
		

		cipherText = splitIntoPair(cipherText);

		
		cipherText = decrypt(cipherText, x);
		
		plaintText = cipherText;
		return plaintText;
		
		
	
	

	}
	
	@Override
	public void printMatrix() {
		// Printing Matrix

				for (int i = 0; i < 5; i++) {

					for (int j = 0; j < 5; j++)

						System.out.print(x[i][j] + " ");

					System.out.println();
				}
	}
	
	
	// Method 1
		// Removing the white spaces from string 'st'
		// which was replaced by the key as space.
	@Override
		public String removeWhiteSpace(char[] ch, String key)
		{

			char[] c = key.toCharArray();

			// removing character which are input by the user
			// from string st

			for (int i = 0; i < c.length; i++) {

				for (int j = 0; j < ch.length; j++) {

					if (c[i] == ch[j])

						c[i] = ' ';
				}
			}

			key = new String(c);

			key = key.replaceAll(" ", "");

			
			return key;
			
		}
		

public String getPlaintText() {
			return plaintText;
		}

		

		public String getKey() {
			return key;
		}

		@Override
		public String splitIntoPair(String str) {
	String s  = "";
      

     
       
	
	
	//to check the pair is not same
			for (int i = 0 ; i < str.length();i++) {
					
					if (str.charAt(i) == ' ')

						//to jump from spaces
						continue;

					else {
						s += str.charAt(i);
					}
					if (i < str.length() - 1)

						if (str.charAt(i) == str.charAt(i + 1))

							s += "x";
				}
			
			if (s.length() % 2 != 0)

				s += "z";

			

			s = s.toLowerCase();
		
			return s;
					
	}
	
//Method 3
	// To find the position of row and column in matrix
	// for encryption of the pair.
	@Override
	public int[] findIJ(char a, char b, char x[][])
	{

		int[] y = new int[4];

		if (a == 'j')

			a = 'i';

		else if (b == 'j')

			b = 'i';

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				if (x[i][j] == a) {

					y[0] = i;

					y[1] = j;
				}

				else if (x[i][j] == b) {

					y[2] = i;

					y[3] = j;
				}
			}
		}

		if (y[0] == y[2]) { // this means if a and b are in the same row

			y[1] -= 1;
			

			y[3] -= 1;
		}

		else if (y[1] == y[3]) { // this means the a and b are in the same column

			y[0] -= 1;

			y[2] -= 1;
		}

		for (int i = 0; i < 4; i++)

		
			if (y[i] == -1)
				y[i]=4;

		return y;
	}
	public String removeDuplicate(String s)
{

	int j, index = 0, len = s.length();

	char c[] = s.toCharArray();

	for (int i = 0; i < len; i++) {

		for (j = 0; j < i; j++) {

			if (c[i] == c[j])

				break;
		}

		if (i == j)

			c[index++] = c[i];
	}	

	s = new String((Arrays.copyOf(c, index)));

	
	return s;
	
}
// Method 4
// To encrypt the plaintext
private String decrypt(String pt, char x[][])
{
	

	char ch[] = pt.toCharArray();

	int a[] = new int[4];

	for (int i = 0; i < pt.length(); i += 2) {

		if (i < pt.length() - 1) {

			a = findIJ(pt.charAt(i), pt.charAt(i + 1),
					x);

			if (a[0] == a[2]) { 

				ch[i] = x[a[0]][a[1]];

				ch[i + 1] = x[a[0]][a[3]];
			}

			else if (a[1] == a[3]) {

				ch[i] = x[a[0]][a[1]];

				ch[i + 1] = x[a[2]][a[1]];
			}

			else {

				ch[i] = x[a[0]][a[3]];

				ch[i + 1] = x[a[2]][a[1]];
			}
		}
	}

	pt = new String(ch);
	

	return pt;
}

		
		



}
