// Java Program to Implement the Monoalphabetic Cypher
 
import java.io.*;
class MonoalphabeticCypher {
    public static char normalChar[]
        = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
 
    public static char codedChar[]
        = { 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B' };
 
    // Function which returns encrypted string
    public static String stringEncryption(String s)
    {
        // initializing an empty String
        String encryptedString = "";
 
        // comparing each character of the string and
        // encoding each character using the indices
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
 
                // comparing the character and
                // adding the corresponding char
                // to the encryptedString
                if (s.charAt(i) == normalChar[j])
                {
                    encryptedString += codedChar[j];
                    break;
                }
 
                // if there are any special characters
                // add them directly to the string
                if (s.charAt(i) < 'a' || s.charAt(i) > 'z')
                {
                    encryptedString += s.charAt(i);
                    break;
                }
            }
        }
 
        // return encryptedString
        return encryptedString;
    }
 
    // Function which returns descryptedString
}
