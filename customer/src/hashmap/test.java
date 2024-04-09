package hashmap;

import java.util.LinkedHashMap;

public class test {
    public static void main(String[] args) {
		LinkedHashMap<Character,String> h1=new LinkedHashMap<Character,String>();
		h1.put('a', "apple");
		h1.put('j', "jspiders");
		h1.put('q', "qspiders");
		h1.put('p', "pyspiders");	
		System.out.println(h1.containsKey('a'));
		//containskey(key)-->return true if that key is present otherwise returns false
		System.out.println(h1.containsKey('l'));
		System.out.println(h1.containsKey('q'));
		
	}
}
 