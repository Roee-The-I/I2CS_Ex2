package assignments.Ex2;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Intro2CS_2026A
 * This class represents a Graphical User Interface (GUI) for Map2D.
 * The class has save and load functions, and a GUI draw function.
 * You should implement this class, it is recommender to use the StdDraw class, as in:
 * https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html
 *
 *
 */
public class Ex2_GUI {
    public static void drawMap(Map2D map) {
        StdDrawTest.drawMat(map.getMap());
    }

    /**
     *
     * @param mapFileName
     */
    public static Map2D loadMap(String mapFileName) {
        ArrayList<int[]> rows = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(mapFileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split("[,\\s]+");
                int[] row = new int[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    row[i] = Integer.parseInt(parts[i]);
                }
                rows.add(row);
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        int h = rows.size();
        int w = rows.get(0).length;
        Map ans = new Map(w, h, 0);
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                ans.setPixel(x, y, rows.get(y)[x]);
            }
        }

        return ans;
    }

    public static void saveMap(Map2D map, String mapFileName) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(mapFileName));

            int w = map.getWidth();
            int h = map.getHeight();

            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    pw.print(map.getPixel(x, y));
                    if (x < w - 1) pw.print(",");
                }
                pw.println();
            }

            pw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] a) {
        String mapFile = "map.txt";
        Map2D map = loadMap(mapFile);
        drawMap(map);
    }
    /// ///////////// Private functions ///////////////
}

/**
 * @param mapFileName
 * @return
 */



