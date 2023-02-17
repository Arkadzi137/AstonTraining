import java.util.Scanner;

public class Methods {
    protected void printHello() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
    }

    protected void checkName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = sc.nextLine();

        if (name.equalsIgnoreCase("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    protected void checkNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 0){
                System.out.println("Не введенно ни одно число");
                break;
            }
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]+" ");
            }
        }
    }
}
