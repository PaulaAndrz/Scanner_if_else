import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String lastname = scanner.nextLine();
        System.out.println("ile masz lat?");
        int age = scanner.nextInt();
        if (age > 18 && age < 29) {
            System.out.println(name + " " + lastname + " Możesz wejść");
        } else if (age == 30) {

            System.out.println(name + " "+ lastname + " " + "Jesteś za stary");
        } else {
            System.out.println(name + " " + lastname +" Nie możesz wejść");
        }

    }
}
