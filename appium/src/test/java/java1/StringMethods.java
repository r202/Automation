package java1;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1.Length of the String.
		
		String s="ramesh";
		String s1="reddy";
		
		System.out.println(s.length());
		
		//charAt(index)--->index starts 0
		//By using this method to display the required Character.
		System.out.println(s.charAt(5));
		
		//Concat method
		
		System.out.println(s.concat(s1));
		
		//String equal& Equal ignore case
		
		String d="abcd";
		String d1="ABCD";
		String d2="ABcd";
		
		System.out.println(d.equals(d1));
		
		System.out.println(d.equalsIgnoreCase(d1));
		
		//Upper case & Lower case
		System.out.println(d1.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(d2.toUpperCase());

		StringBuffer sb=new StringBuffer("Goodmorning");
		
		//delete single character
		
				System.out.println(sb.deleteCharAt(5));
		
		//Delete group of characters
		
		System.out.println(sb.delete(0,2));
		
		//substring--->
		
		StringBuffer sb1=new StringBuffer("Goodmorning");
		System.out.println(sb1.substring(1,5));
	}

}
