
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MonoalphabeticCypher s = new MonoalphabeticCypher();
		String plaint = "our group are sultan + khalid + abdulmajeed";
		
		System.out.println("Plaint text: " + plaint);
		System.out.println("Encrypted text: " +s.stringEncryption(plaint));
		
		
	}

}
