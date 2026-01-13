package caua.dev.collections;

import java.util.HashSet;
import java.util.Set;

public class Ex3 {
	
	
	public static void main(String[] args) {
		Set<String> emSet = new HashSet<String>();
		
		System.out.println(emSet.add("alex@gmail.com"));
		System.out.println(emSet.add("caua@gmail.com"));
		System.out.println(emSet.add("alex@gmail.com"));
		System.out.println(emSet.add("caua@gmail.com"));
		
		
		for (String string : emSet) {
			System.out.println(string);
		}
		
	}

}
