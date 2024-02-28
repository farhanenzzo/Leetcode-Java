package Recursion;

public class towerOfHanoi {

    public static void main(String[] args) {
        int totalDisk = 3;
        hanoi(totalDisk, "S", "H", "D");
    }

    private static void hanoi(int totalDisk, String source, String helper, String destination) {
        if(totalDisk == 1) {
            System.out.println("Transfer Disk " + totalDisk + " from " + source + " to " + destination);
            return;
        }

        hanoi(totalDisk - 1, source, destination, helper);
        System.out.println("Transfer Disk " + totalDisk + " from " + source + " to " + destination);
        hanoi(totalDisk - 1, helper, source, destination);

    }
}
