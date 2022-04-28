package StringPrograms;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Niraj";
		String s2="Niraj";
		
		boolean b;
		
		b=s1.equals(s2);
		if(b==true)
		{
			System.out.println("String Matched");
		}
		else
		{
			System.out.println("Strings Unmatched");
		}

	}

}
