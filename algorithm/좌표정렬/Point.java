package algorithm.좌표정렬;

public class Point implements Comparable<Point> {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if (this.x == point.x) {
            return this.y - point.y;
        } else {
            return this.x - point.x;
        }
    }
}
