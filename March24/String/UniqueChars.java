package March24.String;

public class UniqueChars {
    public static boolean isUnique(String str) {
        boolean[] chars = new boolean[128];
        for (boolean b: chars) {
            System.out.print(b + " ");
        }
        System.out.println("\b");
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            System.out.println("---" + str.charAt(i) + " : " + c + " ------");
            if(chars[str.charAt(i)]) {
                return false;
            }
            chars[str.charAt(i)] = true;
        }
        for (boolean b: chars) {
            System.out.print(b + " ");
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "farhn";
        System.out.println(isUnique(str));

    }
}
