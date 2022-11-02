package chapter5;

import java.util.concurrent.ThreadLocalRandom;

public class Map {
    public static void main(String[] args) {
        short maxLat = 180;
        short maxLong = 360;
        short[][] map = new short[maxLat][maxLong];

        for (int lat = 0; lat < maxLat; lat++) {
            for (int lon = 0; lon < maxLong; lon++) {
                // generate random terrain
                map[lat][lon] = (short) ThreadLocalRandom.current().nextInt(Short.MIN_VALUE, Short.MAX_VALUE);
                System.out.print(map[lat][lon] + " ");
            }
        }
    }
}
