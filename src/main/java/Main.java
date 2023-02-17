public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();

        methods.printHello();
        methods.checkName();

        int[] arr = new int[]{1, 3, 13, 6, 33, 4, 5};
        methods.checkNumbers(arr);
    }
}
