package assignments.Ex2;

public class Index2D implements Pixel2D {
    private int width;
    private int height;
    private int x;
    private int y;

    public Index2D(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public Index2D(Pixel2D other, int w, int h) {
        this.width = w;
        this.height = h;
        this.x = other.getX();
        this.y = other.getY();
    }

    public Index2D(int x, int y, int w, int h) {
        this.width = w;
        this.height = h;
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public double distance2D(Pixel2D p2) {
        int dis = (this.x * p2.getX() + this.y * p2.getY());
        double ans = Math.sqrt(dis);
        return ans;
    }

    @Override
    public String toString() {
        String ans = null;

        return ans;
    }

    @Override
    public boolean equals(Object p) {
        boolean ans = true;

        return ans;
    }
}
