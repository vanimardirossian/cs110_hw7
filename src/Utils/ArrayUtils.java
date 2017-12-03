package Utils;

public class ArrayUtils{
	
	public static int[] reverse(int[] arrInts) {
		int[] result = new int[arrInts.length];
		for(int i = arrInts.length-1; i >= 0; i--) {	
			result[result.length - (i+1)] = arrInts[i];
		}
		return result;
	}
	
	public static String stringifyArray(int[] arrInts) {
		String result = "";

		for(int i = 0; i < arrInts.length; i++) {
			if(i == arrInts.length-1) {
				result = result + arrInts[i];
				break;
			}
			result = result + arrInts[i] + ", ";
		}
		return result;
	}
}