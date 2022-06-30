package LineComparision;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation");
		int x1 = 4;
		int x2 = 9;
		int y1 = 5;
		int y2 = 8;
	    double dis = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	    System.out.println("Two points are (x1,y1)(4,5) and (x2,y2)(9,8)");
	    System.out.println("Length of the line (4,5)(9,8) is " + dis);

	}

}
