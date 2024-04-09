package hashmap;

import java.util.LinkedHashMap;

public class test3 {
	public static void main(String[] args) {
		LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<Character, Integer>();
		int[] arr = { 10, 20, 30, 40, 46, 66, 49, 12, 22, 20, 10, 77, 55, 55 };
		for (int i = 0; i < arr.length; i++) {
			if (h1.containsKey(arr(i))) {
				h1.put(arr(i), h1.get(arr(i)) + 1);

			} else {
				h1.put(arr(i), 1);
			}

		}
		int sum=0;
		for(Integer)
	}

}
