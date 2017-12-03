import Animals.Puppy;
import Utils.Math;
import Utils.ArrayUtils;

public class Driver{
	public static void main(String[] args) {
		
		//Q2:
		Puppy Ross = new Puppy("Ross");
		Puppy Joey = new Puppy("Joey");
		Puppy Chandler = new Puppy("Chandler");
		
		System.out.println(Ross.getName());
		System.out.println(Joey.getName());
		System.out.println(Chandler.getName());
		
		//Q3:
		int[] arrNums = {9, 20, 3, 44, 88, 300};
		
		int[] reversedResult = ArrayUtils.reverse(arrNums);
		
		String stringifiedResult = ArrayUtils.stringifyArray(reversedResult);
		
		System.out.println(stringifiedResult);
		
		//Q4:
		double factorializeThisDouble = 15.4;
		
		int factorializeThisInt = (int)factorializeThisDouble;
		
		long factorializedResult = Math.factorial(factorializeThisInt);
		
		System.out.println(factorializedResult);
			
	}
}