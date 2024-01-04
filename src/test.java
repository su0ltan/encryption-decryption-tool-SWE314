import java.util.Arrays;
import java.util.Scanner;

public class test {
	

	static StoreEnc store[] = new StoreEnc[20];
	static int count = 0;

	static VigenereCipher vg ;
	static PlayfairCipherDecryption pd ;
	static PlayfairEncryption pe ;
	static Frequency_Analysis fa;
	static MonoalphabeticCypher mono;
	static CombiningMonoalphabeticAndPlayfair mp ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		 Instructions ins = new Instructions();
		
		mp = new CombiningMonoalphabeticAndPlayfair();
		 mono = new MonoalphabeticCypher();
	
		 fa = new Frequency_Analysis();
		 pe = new PlayfairEncryption();
		 pd = new PlayfairCipherDecryption();
		 vg = new VigenereCipher();
		
		int x = 0;
		
		while(x != -1) {
			System.out.println("\n \n \n******************************************************");
			System.out.println("Press 1 to Encrypt using monoalphabetic subtitution");
			System.out.println("Press 2 to Encrypt using playfair");
			System.out.println("Press 3 to Encrypt using playfair and monoalphbetic cipher");
			System.out.println("Press 4 to Encrypt using Keyed trasposition");
			System.out.println("Press 5 to to Encrypt using keyed tranposition (bit-level)");
			System.out.println("Press 6 to Encrypt using vigenere cipher");
			System.out.println("Press 7 to Encrypt using DES");
			System.out.println("Press 8 to Decrypt using frequency analysis*");
			System.out.println("Press 9 to Display the encrypted texts");
			
			System.out.println("*******  Press -1 if u want to exit  *******");
			System.out.println("******************************************************\n \n \n");
			
			x = s.nextInt();
			
			String encrypt, decrypt, key;
			int[] keyedKey =new int[4];
			switch(x) {
			
			case -1: return;
			case 1: 
				System.out.println("Enter the plaint text that you want to encrypt");
				encrypt = s1.nextLine();
				System.out.println("The plaint text is: " +encrypt);
				encrypt= mono.stringEncryption(encrypt.toLowerCase());
				System.out.println("The encypted text using monoalphabetic is: "+ encrypt);
				
				
				
				int chossenM = 0;
				while(chossenM != -1) {
					System.out.println("*** *** *** *** *** *** *** ***");
					System.out.println("Press 1 to decrypt the message");
					System.out.println("Press 2 to print the encryption instructions of monoalphabetic");
					System.out.println("Press 3 to print the decryption instructions of monoalphabetic");
					System.out.println("Press 4 to store the encrypted text into the system");
					System.out.println("Press -1 to exit the function");
					System.out.println("*** *** *** *** *** *** *** ***");
					
					chossenM = s.nextInt();
					switch(chossenM) {
					case 1: 
						System.out.println("The encrypted text is: " +encrypt);
						encrypt= mono.stringDecryption(encrypt);
						System.out.println("The decrypted text using monoalphabetic is: "+ encrypt);
						decrypt = "";
						break;
					case 2:
						System.out.println(ins.monoEncryptIns);
						break;
					case 3:
						System.out.println(ins.monoDecrptIns);
						break;
					case 4:
						saveEncryptionText(encrypt, "mono"  , "");
						break;
						
					default:
						System.out.println("Enter valid value");
						break;
					}
					
				}
				break;
			case 2:
				System.out.println("Enter the plaint text that you want to encrypt");
				encrypt = s1.nextLine();
				System.out.println("Enter the key ");
				key = s1.nextLine();
				pd.setKey(key);
				pd.KeyGen();
			
				System.out.println("The plaint text is: " +encrypt);
				encrypt= pe.encryptUsingplayfair(encrypt, key);
				System.out.println("The encypted text using playfair is: "+ encrypt);
				
				
				
				
		
				int m1 = 0;
				while (m1 != -1) {
					System.out.println("*** *** *** *** *** *** *** ***");
					System.out.println("Press 1 to decrypt the message");
					System.out.println("Press 2 to print the encryption instructions of playfair cipher");
					System.out.println("Press 3 to print the decryption instructions of playfair cipher");
					System.out.println("Press 4 to store the encrypted text into the system");
					System.out.println("Press -1 to exit the function");
					System.out.println("*** *** *** *** *** *** *** ***");
					m1 = s.nextInt();
					switch(m1) {
					case 1:
						
						
						System.out.println("The ecrypted text is: " +encrypt);
						
						encrypt= pd.decryptMessage(encrypt);
						System.out.println("The decrypted text using playfair is: "+ encrypt);
						
						break;
						
						
					case 2:
						System.out.println(ins.playfairEncrptIns);
						break;
					case 3:
						System.out.println(ins.playfairDecrptIns);
						break;
					case 4:
						
						saveEncryptionText(encrypt, "playfair" , key);
						
						break;
						default:
							System.out.println("Enter valid value");
							break;
					}
				}
				
				break;
				
			case 3:	
				System.out.println("Enter the plaint text that you want to encrypt using combination between mone and playfair");
				encrypt = s1.nextLine();
				System.out.println("Enter the playfair key ");
				key = s.next();
				System.out.println("The plaint text is: " +encrypt);
				encrypt= mp.encryptUsingMonoAlphabeticAndPlayfair(encrypt, key);
				System.out.println("The encypted text using playfair and mono is: "+ encrypt);
				
				
				
				int m2 = 0;
				while (m2 != -1) {
					System.out.println("*** *** *** *** *** *** *** ***");
					System.out.println("Press 1 to decrypt the message");
					System.out.println("Press 2 to print the encryption instructions of mono and playfair cipher");
					System.out.println("Press 3 to print the decryption instructions of mono and playfair cipher");
					System.out.println("Press 4 to store the encrypted text into the system");
					System.out.println("Press -1 to exit the function");
					System.out.println("*** *** *** *** *** *** *** ***");
					m2 = s.nextInt();
					switch(m2) {
					case 1:
						
						
						System.out.println("The ecrypted text is: " +encrypt);
						encrypt=  mp.decryptUsingMonoAlphabeticAndPlayfair(encrypt, key);
						System.out.println("The decrypted text using playfair is: "+ encrypt);
						
						break;
						
						
					case 2:
						System.out.println(ins.monoAndPEncrptIns);
						break;
					case 3:
						System.out.println(ins.monoAndPfDecrptIns);
						break;
					case 4:
						
						saveEncryptionText(encrypt, "mono+fair" , key);
						break;
						default:
							System.out.println("Enter valid value");
							break;
					}
				}
				
				
				
				
				
				
				break;
			case 4:	
				System.out.println("Enter the plaint text that you want to encrypt");
				encrypt =s1.nextLine();
				Keyed_Transposition_char k = new Keyed_Transposition_char();
				System.out.println("The key is: 1023");
				System.out.println("The plaint text is: "+ encrypt);	
				k.encrypt(encrypt, "1023");
				
				
			    
		
				int m3 = 0;
				while (m3 != -1) {
				    
				    System.out.println("*** *** *** *** *** *** *** ***");
					System.out.println("Press 1 to decrypt the message");
					System.out.println("Press 2 to print the encryption instructions of keyed transposition cipher");
					System.out.println("Press 3 to print the decryption instructions of keyed transposition  cipher");
					System.out.println("Press 4 to store the encrypted text into the system");
					System.out.println("Press -1 to exit the function");
					System.out.println("*** *** *** *** *** *** *** ***");
					
					m3 = s.nextInt();
					switch(m3) {
					case 1:
						System.out.println("This method not exist now please try later");
						break;
					case 2:
						System.out.println(ins.keyedEncrptIns);
						break;
					case 3:
						System.out.println("This method not exist now please try later");
						break;
					case 4:
						saveEncryptionText(encrypt, "keyedchar" , "");
						break;
					default:
						System.out.println("Enter valid value");
						break;
					}
				}
			    
			    
			    
				
				//key
				
				
				break;
			case 5:
				System.out.println("Enter the plaint text that you want to encrypt");
				encrypt = s1.nextLine();
				
				Keyed_Transposition_bits kb = new Keyed_Transposition_bits();
				System.out.println("The key is: 1023");
				System.out.println("The plaint text is: "+ encrypt);
				kb.encrypt(encrypt, "1023");
				//key
				
					
					int m4 = 0;
					while (m4 != -1) {
						  System.out.println("*** *** *** *** *** *** *** ***");
							System.out.println("Press 1 to decrypt the message");
							System.out.println("Press 2 to print the encryption instructions of keyed transposition cipher");
							System.out.println("Press 3 to print the decryption instructions of keyed transposition  cipher");
							System.out.println("Press 4 to store the encrypted text into the system");
							System.out.println("Press -1 to exit the function");
							System.out.println("*** *** *** *** *** *** *** ***");
						m4 = s.nextInt();
						switch(m4) {
						case 1:
							System.out.println("This method not exist now please try later");
							break;
						case 2:
							System.out.println(ins.keyedEncrptIns);
							break;
						case 3:
							System.out.println("This method not exist now please try later");
							break;
						case 4:
							saveEncryptionText(encrypt, "keyedbit" , "");
							break;
						default:
							System.out.println("Enter valid value");
							break;
						}
					}
				break;
			case 6:
				//abdulmajid
				//vigenere cipher
				System.out.println("Enter the plaint text that you want to encrypt");
				encrypt = s1.nextLine();
				System.out.println("Enter the key ");
				key = s.next();
				System.out.println("The plaint text is: " +encrypt);
				encrypt= vg.encrypt(encrypt, key);
				System.out.println("The encrypted text is: " +encrypt);
				
					
					int m5 = 0;
					while (m5 != -1) {
						 System.out.println("*** *** *** *** *** *** *** ***");
							System.out.println("Press 1 to decrypt the message");
							System.out.println("Press 2 to print the encryption instructions of vigenere cipher");
							System.out.println("Press 3 to print the decryption instructions of vigenere cipher");
							System.out.println("Press 4 to store the encrypted text into the system");
							System.out.println("Press -1 to exit the function");
							System.out.println("*** *** *** *** *** *** *** ***");
						m5 = s.nextInt();
						switch(m5) {
						case 1:
							System.out.println("The encrypted text is: " +encrypt);
							System.err.println("The key used in encyption is: "+key);
							encrypt = vg.decrypt(encrypt, key);
							System.out.println("The decrypted text using vigenere is: "+ encrypt);
							
							
							break;
						case 2:
							System.out.println(ins.vigenereEncrptIns);
							break;
						case 3:
							System.out.println(ins.vigenereDecrptIns);
							break;
						case 4:
							
							saveEncryptionText(encrypt, "vigenere" , key);
							break;
						default:
							System.out.println("Enter valid value");
							break;
						}
				
					}
				break;
				
			case 7:
				System.out.println(ins.DESEncrptIns);
				break;
			case 8:
				System.out.println("Enter the cipher text you want to break: ");
				encrypt = s1.nextLine();
				encrypt = encrypt.toUpperCase();
				fa.printString(encrypt);
				break;
			
			case 9:

				for(int i = 0 ; i < count;i++) {
					System.out.print((i+1)+" ");
					 store[i].print();
					 
				}
				System.out.println("Enter the numbber of message that you want to decrypt");
				int wh = s.nextInt() - 1 ;
				System.out.println(wh);
				
				if(store[wh].method.equals("mono")) {
					System.out.println("*this message encrypted by monoalpabetic subtitution");
					System.out.println("The decryption text is: "+ mono.stringDecryption(store[wh].encryptionMessage));
					
					
				}else if(store[wh].method.equals("playfair")) {
					System.out.println("*this message encrypted by playfair");
					System.out.println("The decryption text is: "+ pd.decryptMessage(store[wh].encryptionMessage));
							
					
				}else if(store[wh].method.equals("mono+fair")) {
					System.out.println("*this message encrypted using combining monoalpabetic subtitution and playfair cipher");
					System.out.println("The decryption text is: "+ mp.decryptUsingMonoAlphabeticAndPlayfair(store[wh].encryptionMessage , store[wh].key));
					
					
				}else if(store[wh].method.equals("keyedchar")) {
					System.out.println("No implementation for this method");
					
				}else if(store[wh].method.equals("keyedbit")) {
					System.out.println("No implementation for this method");
					
				}else if(store[wh].method.equals("vigenere")) {
					
					System.out.println("*this message encrypted by vigenere cipher");
					System.out.println("The decryption text is: "+ vg.decrypt(store[wh].encryptionMessage , store[wh].key));
					
				}
					
					
				
				
				break;
			 default:
				 System.out.println("Invalid value!");
				 break;
				
				
			}
			
			
	
			
		}
	}
	public static void saveEncryptionText(String msg , String method , String key) {
		
		
		store[count++] = new StoreEnc(msg , method , key);
		
	}
	 
	

}
