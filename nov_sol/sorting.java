package nov_sol;

import java.util.ArrayList;
import java.util.List;

public class sorting {
    public static void bruteForce(int[] arr) {
        List<Integer> out = new ArrayList<>();

        for(int i:arr) {
            if(i == 0) {
                out.add(i);
            }
        }
        for(int i:arr) {
            if(i == 1) {
                out.add(i);
            }
        }
        for(int i:arr) {
            if(i == 2) {
                out.add(i);
            }
        }

        System.out.println(out);
    }

    public static void dutchNationalFlag(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;

                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,2,0};

        bruteForce(arr);

        dutchNationalFlag(arr);
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
