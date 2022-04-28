package StringPrograms;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Sachin");
		//s.concat("Tendulkar"); Since Strings are immutable, its value won't change...
		s.append("Tendulkar");
		System.out.println(s);
	}

}
