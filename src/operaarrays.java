
public class operaarrays {

	public static int array[] = new int[5];
	public static int suma;
	
	public static void main(String[] args) {
		rellenaarray();

	}
	
	/**
	 * 
	 */
	public static void rellenaarray() {
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) Math.round(Math.random()*20);
		}
	}
	
}
	
	