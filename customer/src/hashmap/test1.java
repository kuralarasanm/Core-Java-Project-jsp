package hashmap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> h1=new LinkedHashMap<Character,Integer>();
//		String s="hello hi bye welcome";
		Scanner ip=new Scanner(System.in);
		System.out.println("enter your String:");
		String s=ip.next();
		for(int i=0;i<s.length();i++) {
			if(h1.containsKey(s.charAt(i))) {
				h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
				
			}
			else {
				h1.put(s.charAt(i),1);
			}
		}
		for(Character ele:h1.keySet()) {
			System.out.println(ele+"-"+h1.get(ele));
		}
	}

}
