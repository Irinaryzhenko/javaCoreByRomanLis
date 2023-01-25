public class Label {
    public static void main (String[] args) {
        L:int[] array = {3, 4, 5};
        while (true) {
            while (true) {
                break L;
            }
        }
        System.out.println("out of outer");
    }

}
