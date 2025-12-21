package assignments.Ex2;

import java.io.Serializable;

/**
 * This class represents a 2D map (int[w][h]) as a "screen" or a raster matrix or maze over integers.
 * This is the main class needed to be implemented.
 *
 * @author boaz.benmoshe
 *
 */
public class Map implements Map2D, Serializable {

    // edit this class below
    private int[][] map;

    /**
     * Constructs a w*h 2D raster map with an init value v.
     *
     * @param w
     * @param h
     * @param v
     */
    public Map(int w, int h, int v) {
        init(w, h, v);
    }

    /**
     * Constructs a square map (size*size).
     *
     * @param size
     */
    public Map(int size) {
        this(size, size, 0);
    }

    /**
     * Constructs a map from a given 2D array.
     *
     * @param data
     */
    public Map(int[][] data) {
        init(data);
    }

    @Override
    public void init(int w, int h, int v) {
        if (w <= 0 || h <= 0) {
            throw new RuntimeException("Invalid dimensions");
        }
        int[][] newMap = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                newMap[i][j] = v;
            }
        }
        this.map = newMap;
    }

    @Override
    public void init(int[][] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("Invalid dimensions");
        }
        if (arr[0] == null || arr[0].length == 0) {
            throw new RuntimeException("Invalid array");
        }
        int h = arr.length;
        int w = arr[0].length;
        int[][] ans = new int[h][w];
        for (int i = 0; i < h; i++) {
            if (arr[i] == null || arr[i].length != w) {
                throw new RuntimeException("Ragged or null row");
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = arr[i][j];
            }
        }
        this.map = ans;
    }

    @Override
    public int[][] getMap() {
        int[][] ans = null;
        int h = this.map.length;
        int w = this.map[0].length;
        ans = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = this.map[i][j];
            }
        }
        return ans;
    }

    @Override
    public int getWidth() {
        return map[0].length;
    }

    @Override
    public int getHeight() {
        return map.length;
    }

    @Override
    public int getPixel(int x, int y) {
        int ans = -1;

        return ans;
    }

    @Override
    public int getPixel(Pixel2D p) {
        int ans = -1;

        return ans;
    }

    @Override
    public void setPixel(int x, int y, int v) {

    }

    @Override
    public void setPixel(Pixel2D p, int v) {

    }

    @Override
    public boolean isInside(Pixel2D p) {
        boolean ans = true;

        return ans;
    }

    @Override
    public boolean sameDimensions(Map2D p) {
        boolean ans = false;

        return ans;
    }

    @Override
    public void addMap2D(Map2D p) {

    }

    @Override
    public void mul(double scalar) {

    }

    @Override
    public void rescale(double sx, double sy) {

    }

    @Override
    public void drawCircle(Pixel2D center, double rad, int color) {

    }

    @Override
    public void drawLine(Pixel2D p1, Pixel2D p2, int color) {

    }

    @Override
    public void drawRect(Pixel2D p1, Pixel2D p2, int color) {

    }

    @Override
    public boolean equals(Object ob) {
        boolean ans = false;
        if (this == ob) {
            ans = true;
            return ans;
        }
        if (ob == null || !(ob instanceof Map2D)) {
            ans = false;
            return ans;
        }
        Map2D map2D = (Map2D) ob;

        if (this.getWidth() != map2D.getWidth() || this.getHeight() != map2D.getHeight()) {
            ans = false;
            return ans;
        }
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                if (this.getPixel(x, y) != map2D.getPixel(x, y)) {
                    ans = false;
                    return ans;
                }
            }
        }
        ans = true;
        return ans;
    }

    @Override
    /**
     * Fills this map with the new color (new_v) starting from p.
     * https://en.wikipedia.org/wiki/Flood_fill
     */
    public int fill(Pixel2D xy, int new_v, boolean cyclic) {
        int ans = -1;

        return ans;
    }

    @Override
    /**
     * BFS like shortest the computation based on iterative raster implementation of BFS, see:
     * https://en.wikipedia.org/wiki/Breadth-first_search
     */
    public Pixel2D[] shortestPath(Pixel2D p1, Pixel2D p2, int obsColor, boolean cyclic) {
        Pixel2D[] ans = null;  // the result.

        return ans;
    }

    @Override
    public Map2D allDistance(Pixel2D start, int obsColor, boolean cyclic) {
        Map2D ans = null;  // the result.

        return ans;
    }
    ////////////////////// Private Methods ///////////////////////

}
