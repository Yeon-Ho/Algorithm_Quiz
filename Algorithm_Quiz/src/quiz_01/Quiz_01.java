package quiz_01;

import java.util.Arrays;
import java.util.Comparator;

public class Quiz_01 {
	public static void main(String[] args) {
	
		int[] numArr = {6,10,2};
		
		System.out.println("정답 : " +solution(numArr));
	
	}
	
	public static String solution(int[] numbers) {
		
		String[] arr = new String[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				String lvalue = o2 + o1;
				String rvalue = o1 + o2;

				System.out.println("===================");
				System.out.println(lvalue);
				System.out.println(rvalue);
				System.out.println("===================");

				System.out.println(lvalue.compareTo(rvalue));
				return lvalue.compareTo(rvalue);
			}
			
		});
		
		if(arr[0].equals("0")) {
			return "0";
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}
		
		return sb.toString();
	}
	
	
	
}
