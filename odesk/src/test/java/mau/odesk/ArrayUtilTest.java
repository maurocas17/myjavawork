package mau.odesk;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	/**
	 *   Testing By zero rotation
	 */
	public void rotateArrayByZero() {
		int[] result = ArrayUtil.rotateArray(new int[] {1,2,3,4,5,6}, 0);
		int[] expected = {1,2,3,4,5,6};
		assertArrayEquals(String.format("ByZero:%s", Arrays.toString(result)), expected, result);
	}

	@Test
	/**
	 *   Testing By One rotation
	 */
	public void rotateArrayByOne() {
		int[] result = ArrayUtil.rotateArray(new int[] {1,2,3,4,5,6}, 1);
		int[] expected = {2,3,4,5,6,1};
		assertArrayEquals(String.format("ByOne:%s", Arrays.toString(result)), expected, result);
	}
	
	@Test
	/**
	 *   Testing By Two rotation
	 */
	public void rotateArrayByTwo() {
		int[] result = ArrayUtil.rotateArray(new int[] {1,2,3,4,5,6}, 2);
		int[] expected = {5,6,1,2,3,4};
		assertArrayEquals(String.format("ByTwo:%s", Arrays.toString(result)), expected, result);

		result = ArrayUtil.rotateArray(new int[] {1,2,3,4,5}, 2);
		expected = new int[] {5,1,2,3,4};
		assertArrayEquals(String.format("ByTwo, 5 array length:%s", Arrays.toString(result)), expected, result);
	}

	@Test
	/**
	 *   Testing By Three rotation
	 */
	public void rotateArrayByThree() {
		int[] result = ArrayUtil.rotateArray(new int[] {1,2,3,4,5,6}, 3);
		int[] expected = {4,5,6,1,2,3};
		assertArrayEquals(String.format("ByThree:%s", Arrays.toString(result)), expected, result);
		
		result = ArrayUtil.rotateArray(new int[] {1,2,3,4,5,6,7}, 3);
		expected = new int[] {3,4,5,6,7,1,2};
		assertArrayEquals(String.format("ByThree, 7 array length:%s", Arrays.toString(result)), expected, result);
	}
	
	@Test
	/**
	 *   Testing by a number greater than the length of the array
	 */
	public void rotateArrayByGreaterThanLength() {
		int[] result = ArrayUtil.rotateArray(new int[] {1,2,3,4,5,6}, 8);
		int[] expected = {5,6,1,2,3,4};
		assertArrayEquals(String.format("ByEigth:%s", Arrays.toString(result)), expected, result);
		
		result = ArrayUtil.rotateArray(new int[] {1,2,3,4,5,6}, 11);
		expected = new int[] {2,3,4,5,6,1};
		assertArrayEquals(String.format("ByEleven:%s", Arrays.toString(result)), expected,result);
	}
}
