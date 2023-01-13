import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    static List<Integer> generatePrimesUntil100() {
        List<Integer> primeNumbers = new ArrayList<>(List.of(1, 2, 3, 5, 7));

        for (int i = 8; i < 1000000; i++) {
            if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0) && !(i % 7 == 0)) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Search Algorithms tryouts.");
        System.out.println("Choose a prime number from the below list:");

        List<Integer> primes = generatePrimesUntil100();
        System.out.println(primes);

        Scanner sc = new Scanner(System.in);
        System.out.print("Type your number: ");
        int selectedPrime = sc.nextInt();
        sc.close();

        System.out.println("You choose " + selectedPrime);

        Instant start = Instant.now();
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i) == selectedPrime) {
                Instant end = Instant.now();
                Duration timeElapsed = Duration.between(start, end);
                System.out.println("Your selected prime is stored at index " + i + " of the list.");
                System.out.println("This search was made using Linear Search Algorithm and it took " + timeElapsed.getNano()
                        + " nanoseconds.");
            }
        }

        boolean found = false;
        int index = 0;
        while (!found) {

        }
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i) == selectedPrime) {
                Instant end = Instant.now();
                Duration timeElapsed = Duration.between(start, end);
                System.out.println("Your selected prime is stored at index " + i + " of the list.");
                System.out.println("This search was made using Linear Search Algorithm and it took " + timeElapsed.getNano()
                        + " nanoseconds.");
            }
        }
    }
}
