public class testArray {
    public static void main(String[] args) {
        int total = 0;

        for (int a = 1; a <= 2; a++) {
            for (int b = 1; b <= 2; b++) {
                total = total + a;
            }
        }
        System.out.println(total);
    }
}
