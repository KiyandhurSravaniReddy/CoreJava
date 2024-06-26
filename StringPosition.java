package Strings;

public class Stringex4 {

	public static void main(String[] args) {
		String s1="kiyandhur pallavi reddy skht hyd";
		String [] strarry=s1.split(" ");
		for(int i=0;i<strarry.length;i++) {
			System.out.println(i+ "th position=> "+strarry[i]);
		}
	}

}
