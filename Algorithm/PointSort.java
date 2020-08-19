import java.util.*;
public class PointSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] point = new Point[n];
		ArrayList<Point> pointList = new ArrayList<Point>();
		for (int i=0;i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
			point[i] = new Point(x, y);
			pointList.add(point[i]);
		}
    sc.close();
		Collections.sort(pointList);
		for (int i=0;i<pointList.size(); i++) {
            System.out.println(pointList.get(i).getX() + " " + pointList.get(i).getY());
        }
	}
}

class Point implements Comparable<Point> {
	private int x;
	private int y;

	Point() {
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int compareTo(Point a) {
		if (this.x < a.x) {
			return -1;
		}
    else if (this.x > a.x) {
			return 1;
		}
    else {
			if (this.y < a.y) {
				return -1;
			} else
				return 1;
		}
	}
}
