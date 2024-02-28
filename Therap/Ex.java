package Therap;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        String num = "1234t";
        try{
            int test = Integer.parseInt(num);
            System.out.println(test);
        }catch (Exception e){
            System.out.println("Invalid");
        }


    }

}
