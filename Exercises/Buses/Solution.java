package Exercises.Buses;

import java.util.Dictionary;

public class Solution {
    public static void main(String[] args) {
        int[] buses = {10, 20};
        int[] passangers = {2,17,18,19};
        int capacity = 2;
        int[] PassAlocateds = {};

        System.out.println(LatestTimeToCatchTheBus(buses, passangers, capacity););
    }

    public static int LatestTimeToCatchTheBus(int[] buses, int[] passangers, int capacity){
        return 1;
    }

    public void OrdenationHour(int[] buses, int[] passangers, int capacity){    
        for (int i = 0; i <= passangers.length; i++){
                for (int m = i + 1; m <= passangers.length - 1; m++){
                    if (passangers[i] > passangers[m]) {
                        int temp =  passangers[i];
                        passangers[i] = passangers[m];
                        passangers[m] = passangers[i];
                }
            }
        }
    }

    public void AlocationPass(int[] buses, int[] passangers, int capacity, int[] PassAlocateds){
        for (int e : buses ){
            for (int l : passangers){
                if (passangers[l] <= buses[e]){
                    if (capacity >= 0){
                        PassAlocateds[] = passangers[l];
                    }
                }
            }
        }
    }
}