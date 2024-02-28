package Therap;

// todo: find all possible combinations

import java.util.ArrayList;
import java.util.List;

public class FindAllCombination {
    public static void main(String[] args) {
        String [] arr = {"a", "b", "c"};
        int[] num = {1,2,3};

        List<String> list = new ArrayList<>();

        for(String i: arr) {
            list.add(i);
        }

        for (String s : arr) {
            for (String value : arr) {
                list.add(s + value);
            }
        }
        System.out.println(list);
    }
}
