import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int goodCount = 0;
        int fixCount = 0;
        int rejectCount = 0;

        for (int i = 0; i < n; i++) {
            int detector = scanner.nextInt();
            if (detector == 0) {
                goodCount++;
        } else if (detector == 1 ) {
                fixCount++;
            } else if (detector == -1) {
                rejectCount++;
            }
        }
        System.out.println(goodCount + " " + fixCount + " " + rejectCount);
    }
}