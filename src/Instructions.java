
public class Instructions {
	public  final String monoAndPfDecrptIns=
			"First, use the playfair decrption method,then use monoalphabetic decyption."
			+ "\n"
			+ "playfair decyption steps:\n\n"
			+ this.playfairDecrptIns+"\n\n"
			+ "Monoalphabetic subtitution steps:\n\n "+this.monoDecrptIns;
			
			;
	public final String monoAndPEncrptIns=
			"First, use the monoalphabetic subtitution encryption method,then use playfair encruption."
					+ "\n"
					+ "Monoalphabetic subtitution steps:\n\n "+this.monoEncryptIns
					
					
					+ "playfair encyption steps:\n\n"+ this.playfairEncrptIns+"\n\n";
					
	public final String monoDecrptIns=""
			+ "1. Identify the cipher alphabet: The first step in monoalphabetic decryption is\n to identify the cipher alphabet used by the sender. This can be done by analyzing the frequency distribution of letters in the ciphertext and comparing it to the frequency distribution of letters in the English language.\r\n"
			+ "\r\n"
			+ "2. Create a decryption table: Once you have identified the cipher alphabet,\n create a decryption table that maps each letter in the ciphertext to its corresponding letter in the plaintext.\r\n"
			+ "\r\n"
			+ "3. Decrypt the message: Using your decryption table, decrypt each letter in the\n ciphertext and replace it with its corresponding plaintext letter.\r\n"
			+ "\r\n"
			+ "4. Check for errors: After decrypting the entire message, check for any errors or\n inconsistencies that may have occurred during decryption.\r\n"
			+ "\r\n"
			+ "5. Repeat as necessary: If there are any errors or inconsistencies, repeat steps 1-4\n until you have successfully decrypted the entire message without errors."; 
	
	
	
	public  final String monoEncryptIns=""
			+ "1. Choose a secret key: This is a random sequence of letters that will be used to\n encrypt and decrypt messages.\r\n"
			+ "\r\n"
			+ "2. Create a table: Create a table with two columns, one for the plaintext alphabet\n and one for the corresponding ciphertext alphabet.\r\n"
			+ "\r\n"
			+ "3. Substitute letters: Substitute each letter in the plaintext alphabet with a\n corresponding letter in the ciphertext alphabet using the secret key.\r\n"
			+ "\r\n"
			+ "4. Encrypt message: To encrypt a message, replace each letter in the plaintext\n message with its corresponding ciphertext letter from the table.\r\n"
			+ "\r\n"
			+ "5. Decrypt message: To decrypt a message, replace each letter in the ciphertext\n message with its corresponding plaintext letter from the table using the secret key.\r\n"
			+ ""; 
	
	
	
	public  final String playfairEncrptIns=""
			+ "The Playfair encryption algorithm involves the following steps:\r\n"
			+ "\r\n"
			+ "1. Generating the key: Choose a keyword or phrase and remove any duplicate letters.\n Then, fill in the remaining spaces with the remaining letters of the alphabet in order.\r\n"
			+ "\r\n"
			+ "2. Creating the matrix: Write the key horizontally across a 5x5 grid, filling in the\n remaining spaces with the remaining letters of the alphabet in order.\r\n"
			+ "\r\n"
			+ "3. Preprocessing: Remove any non-alphabetic characters from the plaintext and convert\n all letters to uppercase.\r\n"
			+ "\r\n"
			+ "4. Breaking into pairs: Divide the plaintext into pairs of two letters each, adding \n an \"X\" if necessary to make an even number of letters.\r\n"
			+ "\r\n"
			+ "5. Encryption: For each pair of letters, apply one of four rules to encrypt them:\r\n"
			+ "\r\n"
			+ "- If both letters are in the same row, replace each letter with the letter to its\n  right (wrapping around to the beginning of the row if necessary).\r\n"
			+ "- If both letters are in the same column, replace each letter with the letter below\n it (wrapping around to the top of the column if necessary).\r\n"
			+ "- If neither rule 1 nor rule 2 applies and both letters are different, replace them\n with the two corner points of their respective rectangle formed by their positions in the matrix.\r\n"
			+ "- If both letters are identical, insert an \"X\" between them before applying any other\n rules.\r\n"
			+ "\r\n"
			+ "6. Output: Write out all encrypted pairs as a single string.\r\n"
			+ "\r\n"
			+ "To decrypt a Playfair ciphertext, simply reverse these steps by using a decryption\n matrix generated from your key and applying similar rules for decryption."; 
	
	
	
	public final String playfairDecrptIns=""
			+ "Here are the steps to decrypt a message using the Playfair cipher:\r\n"
			+ "\r\n"
			+ "1. Write down the encrypted message in pairs of letters, removing any spaces\n or punctuation. If there is an odd number of letters, add an \"X\" at the end to make it even.\r\n"
			+ "\r\n"
			+ "2. Create a 5x5 grid (also known as a key table) with a keyword or phrase that\n you choose. Write the letters of the keyword or phrase in order from left to right and top to bottom, filling in any remaining spaces with the remaining letters of the alphabet (excluding \"J\").\r\n"
			+ "\r\n"
			+ "3. Locate each pair of letters in the grid and determine their positions\n (row and column).\r\n"
			+ "\r\n"
			+ "4. If both letters are in the same row, replace them with the letter to\n their left (wrapping around if necessary).\r\n"
			+ "\r\n"
			+ "5. If both letters are in the same column, replace them with the letter above\n them (wrapping around if necessary).\r\n"
			+ "\r\n"
			+ "6. If neither of these conditions apply, form a rectangle with the two letters\n and replace them with the other two corners of that rectangle.\r\n"
			+ "\r\n"
			+ "7. Repeat steps 3-6 for each pair of letters in the encrypted message.\r\n"
			+ "\r\n"
			+ "8. The resulting plaintext message should be readable.\r\n"
			+ "\r\n"
			+ "Note: If there are any repeated pairs of letters in the encrypted message\n (such as \"AA\"), add an \"X\" between them before starting decryption to avoid errors."; 
	
	
	
	public  final String vigenereEncrptIns=""
			+ "The Vigenere encryption steps are as follows:\r\n"
			+ "\r\n"
			+ "1. Choose a keyword or phrase that will be used to encrypt the message.\r\n"
			+ "\r\n"
			+ "2. Write the keyword above the message to be encrypted, repeating it\n as many times as necessary to cover the entire message.\r\n"
			+ "\r\n"
			+ "3. Assign each letter of the alphabet a number, starting with A = 0,\n B = 1, C = 2, and so on up to Z = 25.\r\n"
			+ "\r\n"
			+ "4. For each letter in the message, find its corresponding number in the\n alphabet and add it to the corresponding number of the letter in the keyword directly above it.\r\n"
			+ "\r\n"
			+ "5. If the sum is greater than 25 (the highest number in our alphabet),\n subtract 26 from it.\r\n"
			+ "\r\n"
			+ "6. Convert each resulting number back into a letter using its corresponding\n position in the alphabet (A = 0, B = 1, etc.).\r\n"
			+ "\r\n"
			+ "7. The resulting letters are your encrypted message.\r\n"
			+ "\r\n"
			+ "8. To decrypt the message, use the same keyword and subtract instead\n of adding to get back to the original message."; 
	
	
	public  final String vigenereDecrptIns="The Vigenere decryption steps are as follows:\r\n"
			+ "\r\n"
			+ "1. Write the ciphertext below the key, repeating the key as necessary to match the length of the ciphertext.\r\n"
			+ "\r\n"
			+ "2. Use the Vigenere table to find the intersection of each letter in the key with each letter in the ciphertext.\r\n"
			+ "\r\n"
			+ "3. The resulting letters in each intersection will be the plaintext letters.\r\n"
			+ "\r\n"
			+ "4. Repeat this process for each letter in the ciphertext until all letters have been decrypted.\r\n"
			+ "\r\n"
			+ "5. The resulting plaintext message is revealed."; 
	
	
	public  final String keyedEncrptIns="The steps for keyed transposition encryption are as follows:\r\n"
			+ "\r\n"
			+ "1. Choose a keyword or phrase that will be used as the key for the encryption.\r\n"
			+ "\r\n"
			+ "2. Write out the message to be encrypted in rows of a fixed length, such as 5 or 6 letters per row.\r\n"
			+ "\r\n"
			+ "3. If necessary, add filler letters to the end of the message to make sure it fills out the last row completely.\r\n"
			+ "\r\n"
			+ "4. Reorder the rows of the message according to the alphabetical order of the letters in the key phrase.\n For example, if the key phrase is \"SECRET\", then all rows starting with an \"S\" would come first,\n followed by all rows starting with an \"E\", and so on.\r\n"
			+ "\r\n"
			+ "5. Write out the reordered message in columns, reading down each column from top to bottom.\r\n"
			+ "\r\n"
			+ "6. The resulting columns represent the encrypted message.\r\n"
			+ "\r\n"
			+ "7. To decrypt, reverse these steps: reorder the rows according to alphabetical\n order of key phrase and then read down each column from top to bottom."; 
	
	
	
	public  final String keyedEncrptInsBits=""
			+ "1. Convert the plaintext message into binary form.\r\n"
			+ "2. Create a key matrix with a predetermined size, such as 5x5 or 6x6.\r\n"
			+ "3. Fill the key matrix with a keyword or phrase, omitting any repeated letters.\r\n"
			+ "4. Divide the binary message into blocks of equal size, based on the number of rows in the key matrix.\r\n"
			+ "5. For each block, read the bits row by row and column by column from\n the key matrix to create a new transposed block.\r\n"
			+ "6. Concatenate all transposed blocks to form the encrypted message.\r\n"
			+ "\r\n"
			+ "Example:\r\n"
			+ "\r\n"
			+ "Plaintext message: HELLO WORLD\r\n"
			+ "Binary form: 01001000 01000101 01001100 01001100 01001111 00100000 01010111 01001111 01010010 01001100 01000100\r\n"
			+ "\r\n"
			+ "Key matrix:\r\n"
			+ "K E Y W O\r\n"
			+ "R D A B C\r\n"
			+ "F G H I J\r\n"
			+ "L M N P Q\r\n"
			+ "S T U V X\r\n"
			+ "\r\n"
			+ "Transposition process:\r\n"
			+ "Block #1: \r\n"
			+ "Original block: \r\n"
			+ "01    00    10    00    10    00    01    01\r\n"
			+ "01    00    01    01    ** ** ** **\r\n"
			+ "Transposed block:\r\n"
			+ "K     E     Y     W     O     R     D     A  \r\n"
			+ "B     C     F     G     \r\n"
			+ "\r\n"
			+ "Block #2:\r\n"
			+ "Original block:\r\n"
			+ "01    ** ** ** **\r\n"
			+ "10    ** ** ** **\r\n"
			+ "Transposed block:\r\n"
			+ "H     I     \r\n"
			+ "J     L     \r\n"
			+ "\r\n"
			+ "Block #3:\r\n"
			+ "Original block:\r\n"
			+ "01    ** ** ** **\r\n"
			+ "11    ** ** ** **\r\n"
			+ "Transposed block:\r\n"
			+ "M     N     \r\n"
			+ "P     Q     \r\n"
			+ "\r\n"
			+ "Block #4:\r\n"
			+ "Original block:\r\n"
			+ "01    ** ** ** **\r\n"
			+ "10    *0*0*1*0*1*\r\n"
			+ "Transposed block:\r\n"
			+ "S     T     \r\n"
			+ "U     V     \r\n"
			+ "X     K     \r\n"
			+ "\r\n"
			+ "Encrypted message: \r\n"
			+ "KE YW OR DA BC FG HI JL MN PQ ST UV XK"; 
	
	
	public  final String DESEncrptIns=""
			+ "1. Key Generation: A 64-bit key is generated using a predetermined algorithm.\r\n"
			+ "\r\n"
			+ "2. Initial Permutation: The 64-bit key is permuted according to a fixed table.\r\n"
			+ "\r\n"
			+ "3. Splitting: The permuted key is split into two 32-bit halves, left and right.\r\n"
			+ "\r\n"
			+ "4. Round Function: The encryption process involves 16 rounds \nof the same function applied to the right half of the data block.\r\n"
			+ "\r\n"
			+ "5. Expansion Permutation: The right half of the data block is \nexpanded from 32 bits to 48 bits using a fixed table.\r\n"
			+ "\r\n"
			+ "6. XOR with Round Key: Each round has its own unique 48-bit round\n key, which is XORed with the expanded right half of the data block.\r\n"
			+ "\r\n"
			+ "7. S-Box Substitution: The result of the XOR operation is split into \neight 6-bit blocks, each of which is substituted using a different S-Box table.\r\n"
			+ "\r\n"
			+ "8. Permutation: After substitution, the eight resulting blocks are \ncombined and permuted according to a fixed table.\r\n"
			+ "\r\n"
			+ "9. XOR with Left Half: The permuted result from step 8 is then XORed\n with the left half of the data block.\r\n"
			+ "\r\n"
			+ "10. Swap and Repeat: After each round, the left and right halves are\n swapped, and the process repeats until all 16 rounds have been completed.\r\n"
			+ "\r\n"
			+ "11. Final Permutation: After all rounds have been completed, a final \npermutation is applied to the combined left and right halves according to a fixed table.\r\n"
			+ "\r\n"
			+ "12. Output: The final output is a 64-bit encrypted message."; 
	
	

}
