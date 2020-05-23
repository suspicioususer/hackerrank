package problem_solving.implementation;

public class DrawingBook {
	
    public static int pageCount(int n, int p) {
    	int result = 0;
    	if(p <= n / 2) {
    		int a = 0;
    		while (a != p && (a + 1) != p) {
    			a += 2;
    			result++;
    		}
    	} else {
    		int a = n % 2 == 0 ? n + 1 : n;
    		while(a != p && (a - 1) != p) {
    			a -= 2;
    			result++;
    		}
    	}
    	return result;
    }

    public static void main(String[] args) {
    	
        int n = 6;
        int p = 2;
        
        int result = pageCount(n, p);
        System.out.println("Result: " + result);
    }
}
