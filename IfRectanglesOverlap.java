/**
 * Given two rectangles, check if they overlap
 * @author mmohita
 *
 */
public class IfRectanglesOverlap {
	
	private static boolean doRectanglesOverlap(Point l1, Point r1, Point l2,Point r2){
		//check if one of them is on top of each other
		if(l1.getY()<r2.getY() || l2.getY()<r1.getY()){
			return false;
		}
		//check if one of them is on left of other
		if(r1.getX() < l2.getX() || r2.getX() < l1.getX()){
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		 Point l1 = new Point(0, 10), r1 = new Point(10, 0); 
		 Point l2 = new Point(5, 5), r2 = new Point(15, 0);
		 if (doRectanglesOverlap(l1, r1, l2, r2)) 
		        System.out.println("Rectangles Overlap"); 
		 else
		        System.out.println("Rectangles Don't Overlap");
	}

}
