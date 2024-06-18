package Collections;

public class AutoBoxing<AB > {
 AB ab;
	public static void main(String[] args) {
		AutoBoxing <String>a=new AutoBoxing<String>();
		a.ab="swetty";
		System.out.println(a.ab);
		
		AutoBoxing <Integer>i=new AutoBoxing<Integer>();
		i.ab=23;
		i.ab=56;
		System.out.println(i.ab);
		
	}

}
