import java.util.Scanner;
import java.util.Locale;
import java.util.Objects;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String name, movieType, discount;
        float age;

        System.out.print("Name: ");
        name = input.next();

        System.out.print("Age: ");
        age = input.nextFloat();

        if (age < 18) {
            System.out.println("Reservation denied (under 18).");
        } else {
            System.out.print("Movie type (action, comic, horror): ");
            movieType = input.next();

            System.out.print("Have discount? (yes/no): ");
            discount = input.next();

            if (Objects.equals(discount, "yes")) {
                if (Objects.equals(movieType, "action")) {
                    System.out.println("Price: 150$ - Reservation accepted.");
                } else if (Objects.equals(movieType, "comic")) {
                    System.out.println("Price: 135$ - Reservation accepted.");
                } else if (Objects.equals(movieType, "horror")) {
                    System.out.println("Price: 195$ - Reservation accepted.");
                } else {
                    System.out.println("Movie not available. Reservation denied.");
                }
            } else if (Objects.equals(discount, "no")) {
                if (Objects.equals(movieType, "action")) {
                    System.out.println("Price: 200$ - Reservation accepted.");
                } else if (Objects.equals(movieType, "comic")) {
                    System.out.println("Price: 180$ - Reservation accepted.");
                } else if (Objects.equals(movieType, "horror")) {
                    System.out.println("Price: 260$ - Reservation accepted.");
                } else {
                    System.out.println("Movie not available. Reservation denied.");
                }
            }
        }
    }
}