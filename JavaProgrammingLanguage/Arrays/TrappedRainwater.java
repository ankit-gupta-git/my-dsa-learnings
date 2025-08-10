import java.util.*;

public class TrappedRainwater{;
    public static int trappedRainwater(int height[]) {
        //calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 0; i < height.length; i++){
            leftMax[i] = Math.max(leftMax[i], leftMax[i + height
        }
        // calculate right max boundary - array

        //loop
        //water = min (leftmaxbound, rightmaxbound)
        //trappedRainwater = waterlevel - height[i]

    }
    public static void main (String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

    }
}