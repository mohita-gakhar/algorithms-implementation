/**
 * Check that given four points form a square or not
 * We check the following:
 * 1. All the sides are of equal length.
 * 2. The angles are of 90 degree.
 * 3. Both the diagonals are of same length
 * @author mmohita
 */
public class FormSquare {
	
	public static boolean isSquare(Point p1,Point p2,Point p3,Point p4){
		
		double d1= Point.distSquare(p1, p2);
		double d2= Point.distSquare(p1, p3);
		double d3= Point.distSquare(p1, p4);
		
		if(d1==d2 && d3==2*d1 && 2*d1==Point.distSquare(p3, p2)){
			double d= Point.distSquare(p2, p4);
			return (d==d1 && d==Point.distSquare(p3, p4));
		}
		if(d1==d3 && d2==2*d3 && 2*d3==Point.distSquare(p2, p4)){
			double d= Point.distSquare(p2, p3);
			return (d==d1 && d==Point.distSquare(p3, p4));
		}
		if(d2==d3 && d1==2*d2 && 2*d2==Point.distSquare(p3, p4)){
			double d= Point.distSquare(p2, p4);
			return (d==d2 && d==Point.distSquare(p2, p3));
		}
		return false;		
	}

	public static void main(String[] args) {
		Point p1= new Point(20, 10);
		Point p2= new Point(10, 20);
		Point p3= new Point(20, 20);
		Point p4= new Point(10, 10);
		System.out.println("Points are "+p1+" "+p2+" "+p3+" "+p4);
		System.out.println("Do points form a square "+isSquare(p1, p2, p3, p4));
	}

}

class Point 
{
	private double x;
	private double y;
	
	Point(double x, double y){
		this.x=x;
		this.y=y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	static double distSquare(Point p1,Point p2){
		return (p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY());
	}

	@Override
	public String toString() {
		return "Point's x: "+x+" y: "+y;
	}
	
	
}
