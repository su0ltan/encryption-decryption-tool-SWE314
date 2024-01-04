import java.util.*;

public class Frequency_Analysis {

	static void printString(String S) {

		String[] plaintext = new String[3];

		int freq[] = new int[26];

		int freqSorted[] = new int[26];

		int Used[] = new int[26];

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != ' ') {
				freq[S.charAt(i) - 'A']++;
			}
		}

		for (int i = 0; i < 26; i++) {
			freqSorted[i] = freq[i];
		}

		String T = "ETAOINSHRDLCUMWFGYPBVKJXQZ";

		Arrays.sort(freqSorted);
		freqSorted = reverse(freqSorted);

		for (int i = 0; i < 3; i++) {

			int ch = -1;

			for (int j = 0; j < 26; j++) {

				if (freqSorted[i] == freq[j] && Used[j] == 0) {
					Used[j] = 1;
					ch = j;
					break;
				}
			}
			if (ch == -1)
				break;

			int x = T.charAt(i) - 'A';

			x = x - ch;

			String curr = "";

			for (int k = 0; k < S.length(); k++) {

				if (S.charAt(k) == ' ') {
					curr += (char) ' ';
					continue;
				}

				int y = S.charAt(k) - 'A';
				y += x;

				if (y < 0)
					y += 26;
				if (y > 25)
					y -= 26;

				curr += (char) ('A' + y);
			}

			plaintext[i] = curr;
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print(plaintext[i].toLowerCase() + "\n");
		}
	}

	static int[] reverse(int a[]) {
		int i, n = a.length, t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the cipher text you want to break: ");
		String S = input.nextLine();
		S = S.toUpperCase();

		printString(S);

	}
}
