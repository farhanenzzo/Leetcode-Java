public class SingleNonRepeatingElement {

    public static void main(String[] args) {
        int[] array = {1,3,1,2,3};

        System.out.println( findNonRepeat(array));

    }

    private static int findNonRepeat(int[] array) {

        int xor = 0;

        for(int num: array) {
            xor = xor ^ num;
        }
        return xor;
    }
}

// using bit wise calculation.

//0 + 0 => 0
//0 + 1 => 1
//1 + 0 => 1
//1 + 1 => 0