package Collections;

public class Genericsex1<Y> {
	Y y;
	public static void main(String[] args) {
		Genericsex1<Boolean> g =new Genericsex1<Boolean>();
//		g.y="a";
//		g.y=12.3;
//		g.y=null;
		
		g.y=true;
//		g.y=10;
		System.out.println("g= "+g.y);
	}

}
