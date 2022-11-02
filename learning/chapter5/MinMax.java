package chapter5;

import java.util.concurrent.ThreadLocalRandom;

public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(0, 101);
        }

        min = max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }
}
