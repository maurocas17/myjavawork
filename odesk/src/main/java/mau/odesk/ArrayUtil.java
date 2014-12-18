package mau.odesk;

import java.util.Arrays;


public class ArrayUtil {
	
	/**
	 * This method accepts an array of integer and rotate it by N positions.
	 * @param array must not be null or empty
	 * @param rotateBy number of positions (N)
	 * @return the array rotated by N positions
	 * @throws IllegalArgumentException if array is null or empty
	 */
	public static int[] rotateArray(int[] array, int rotateBy) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Invalid parameter set, array is null or empty!");
		}
		
		//get index of the starting value
		int start = rotateBy * rotateBy;
		if (start > array.length) {
			start = start % array.length;
		}
		
		//move array by start value
		int[] result = new int[array.length];
		System.arraycopy(array, start, result, 0, array.length-start);
		System.arraycopy(array, 0, result, array.length-start, start);
		
		return result;
	}
	

	public static void main(String args[]) {
		int[] array = {1,2,3,4,5,6}; 
		int rotateBy = 2;
		if (args.length == 2) {
			array = new int[args[0].length()];
			for (int i=0; i < args[0].length(); i++) {
				array[i] = Character.getNumericValue(args[0].charAt(i));
			}
			rotateBy = Integer.parseInt(args[1]);
		}
		System.out.println(Arrays.toString(rotateArray(array, rotateBy)));
	}
}
