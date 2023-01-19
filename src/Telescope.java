import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author lfritz4
 *
 */
public class Telescope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner fin = new Scanner(new File("input.in"));
			//get the size of the array
			int sz = fin.nextInt();
			//make the array
			double [] values = new double[sz];
			//scan the values
			for(int i = 0; i < sz; i++) {
				values[i] = fin.nextDouble();
			}
			
			//check the input array
			for(int i = 0; i< sz; i++) {
				System.out.printf("%.1f ", values[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found.\n");
			e.printStackTrace();
		}

	}

}
