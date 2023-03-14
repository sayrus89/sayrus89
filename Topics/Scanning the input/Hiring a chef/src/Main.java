import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String yearOfExperience = scanner.nextLine();
        String cuisinePreference = scanner.nextLine();
        System.out.print("The form for " + firstName + " is completed." +
        " We will contact you if we need a chef who cooks "
                + cuisinePreference + " dishes and has " + yearOfExperience + " years of experience.");
        // start coding here
    }
}