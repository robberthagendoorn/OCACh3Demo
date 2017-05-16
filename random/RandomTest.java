package random;

public class RandomTest {
	
	private static int[] ar = new int[10];
	
	private static int nGroups = 10;
	
	private static void createArray(){
		for (int i = 0; i < nGroups; i++) {
			ar[i] = 0;
		}
	}	
	
	private static void fillArray(int n){
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			double random = r.getRandom();
			int field = (int)(random*10);
			ar[field]++;
		}
	}
	
	private static double calculateX (int n) {
		double x = 0.0;
		for (int i = 0; i < nGroups; i++) {
			int E = n / nGroups;
			double chance = (ar[i]-E)*(ar[i]-E)/E;
			x += chance;
		}
		return x;
	}
	
    private static void printResults() {
        for (int i = 0; i < nGroups; i++) {
            System.out.println(ar[i]);
        }
    }        

	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		createArray();
		fillArray(n);
		double x = calculateX(n);
		System.out.println(x + "\n");
        printResults();
	}	
}
		
