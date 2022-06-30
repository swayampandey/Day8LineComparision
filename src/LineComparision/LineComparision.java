package LineComparision;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation");
		int x1 = 4;
		int x2 = 9;
		int y1 = 5;
		int y2 = 8;
		int a1 = 6;
		int a2 = 12;
		int b1 = 5;
		int b2 = 15;
	    double dis = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	    double dis2 = Math.sqrt(Math.pow((a2-a1), 2) + Math.pow((b2-b1), 2));
	    System.out.println("Two points are (x1,y1)(4,5) and (x2,y2)(9,8)");
	    System.out.println("Another Two points are (a1,b1)(6,5) and (a2,b2)(12,15)");
	    System.out.println("Length of the first line (4,5)(9,8) is " + dis);
	    System.out.println("Length of the second line (6,5)(12,15) is " + dis2);
	    Integer obj1 = new Integer((int) dis);
	    Integer obj2 = new Integer((int) dis2);
	    System.out.println("these lines are equal :" + obj1.equals(obj2));
	}

}
