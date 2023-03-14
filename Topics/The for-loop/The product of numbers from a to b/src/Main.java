import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = 1;
        if (num1 < num2) {
            for (int i = num1; i < num2; i++) {
                result *= i;
            }
        }
        System.out.print(result);
    }
}