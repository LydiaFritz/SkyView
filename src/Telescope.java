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
			int rows = fin.nextInt(), cols = fin.nextInt();
			//make the array
			double [] values = new double[rows*cols];
			//scan the values
			for(int i = 0; i < rows*cols; i++) {
				values[i] = fin.nextDouble();
			}
			
			/*
			 * //check the input array for(int i = 0; i< rows*cols; i++) {
			 * System.out.printf("%.1f ", values[i]); } System.out.println();
			 */
			
			//create the 2-d array
			double [][] skyview = new double[rows][cols];
			
			//if row is even, go from left to right
			//if row is odd, go from right to left
			int index = 0;
			for(int r = 0; r < rows; r++) {
				if(r%2 == 0) {
					for(int c = 0; c < cols; c++) {
						skyview[r][c] = values[index++];
					}
				}
				else {
					for(int c = cols-1; c >= 0; c--) {
						skyview[r][c] = values[index++];
					}
					
				}
			}
			
			//print the 2-d array
			for(int r = 0; r < rows; r++) {
				for(int c = 0; c < cols; c++) {
					System.out.printf("%.1f  ", skyview[r][c]);
				}
				System.out.println();
			}
			
			//see the average
			System.out.println("Average = " + getAverage(skyview, 0, 0, 1, 1));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found.\n");
			e.printStackTrace();
		}

	}
	
	public static double getAverage(double[][]view, int startR, int startC, int endR, int endC) {
		double avg = 0.0;
		int count = 0;
		for(int r = startR; r <= endR; r++) {
			for(int c = startC; c <= endC; c++) {			
				avg += view[r][c];
				count++;
			}
		}
		return avg/count;
	}

}
