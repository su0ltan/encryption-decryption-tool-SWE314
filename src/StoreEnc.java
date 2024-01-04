
public class StoreEnc {
	public String encryptionMessage, method , key;
	public StoreEnc(String encryptionMessage , String method , String key) {
		this.encryptionMessage = encryptionMessage;
		this.method =method;
		this.key = key;
	}
	public void print() {
		System.out.println("The encryption message is: "+ encryptionMessage);
	}

}
