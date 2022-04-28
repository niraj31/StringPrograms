package StringPrograms;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="SachinTendulkar";
		String s2="	SachinTendulkar		";
		
		System.out.println("Orignal String: "+s1);
		System.out.println("Substring from Index 6: "+s1.substring(6));
		System.out.println("Substring from undex 0 to 6"+s1.substring(0, 6));
		
		String msg = new String("Hello Good Evening to Everyone");
		
		String text[]=msg.split(",");
		System.out.println(Arrays.toString(text));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s1.startsWith("Sa"));
		System.out.println(s1.endsWith("r"));
		System.out.println(s1.charAt(6));
		System.out.println(s1.charAt(10));
		System.out.println(s1.length());
		System.out.println(s1.replace("Sachin","Tendulkar"));

	}

}
