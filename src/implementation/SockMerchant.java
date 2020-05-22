package implementation;

public class SockMerchant {

	public static int sockMerchant(int n, int[] ar) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			if(ar[i] == -1) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if(ar[i] == ar[j]) {
					result++;
					ar[i] = -1;
					ar[j] = -1;
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int result = sockMerchant(ar.length, ar);
		System.out.println("Result:" + result);
	}
}
