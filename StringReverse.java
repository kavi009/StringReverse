package session4;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
	      @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse);
	}

}
