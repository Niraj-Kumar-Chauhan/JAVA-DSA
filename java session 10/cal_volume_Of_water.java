/*Given n non-negative integers representing an vlevation map
 where the width of each bar is 1 , compute how much water it can trap after raining.*/
 
import java.util.*;
public class cal_volume_Of_water {
    public static int waterVolume(int height[]){
        int n = height.length;
        // left maximum height bar
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
        // right maximum height bar
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        int trappedWater = 0;
        for(int j = 0; j<n; j++){
            int waterLable = Math.min(rightMax[j] , leftMax[j]);
            trappedWater += waterLable - height[j];
        }
        return trappedWater;
    }

    public static void main(String args[]){
        int height[] = {4 , 2 , 0 , 6 , 3 , 2 , 5};
        int trappedWaterVolume = waterVolume(height);
        System.out.println("Water volume is : " + trappedWaterVolume);
    }
}