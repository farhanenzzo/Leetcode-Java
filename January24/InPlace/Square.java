package January24.InPlace;

public class Square {
    public static void makeSquare(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        makeSquare(arr);

        for(int sq:arr) {
            System.out.println(sq);
        }

        System.out.println("-------------------");
        int[] sqArr = squareArrayOutOfPlace(arr);
        for(int sq:sqArr) {
            System.out.println(sq);
        }

    }

    public static int[] squareArrayOutOfPlace(int[] intArray) {

        int[] squaredArray = new int[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            squaredArray[i] = (int) Math.pow(intArray[i], 2);
        }

        return squaredArray;
    }
}
