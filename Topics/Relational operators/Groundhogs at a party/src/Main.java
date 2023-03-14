import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int cups = scanner.nextInt();
        boolean answerLogic = scanner.nextBoolean();
        boolean notWeekend = cups >= 10 && cups <= 20;
        boolean weekend = cups >= 15 && cups <= 25;
        System.out.println(notWeekend && !answerLogic || weekend && answerLogic);
    }
}