import java.util.Scanner;

public class Customer2 {
    String firstName;
    String lastName;
    int dateOfBirth;
    int phoneNumber;
    String street;
    int houseNumber;

    public String addressCheck(String street, int houseNumber) {
        String userStreet;
        int userHouseNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название улицы: ");
        userStreet = scanner.nextLine();
        System.out.println("Введите номер дома по улице " + userStreet);
        userHouseNumber = scanner.nextInt();
        scanner.close();

        if (street.equals(userStreet) && houseNumber == userHouseNumber) {
            System.out.println("Адреса совпадают!");
            return "Адреса совпадают!";
        }
        else {
            System.out.println("Адреса отличаются!");
            return "Адреса отличаются!";
        }

    }


    public String numberСheck() {
        int number;
        System.out.println("Введите номер для проверки: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        if (phoneNumber == number) {
            return "Номер телефона совпадает с пользователем!";
        }
        else {
            return "Номер телефона отличается!";
        }


    }
}
