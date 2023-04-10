import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        int[] primes = new int[num];
        int count = 0;
        int curr = 2;

        while (count < num) {
            if (isPrime(curr)) {
                primes[count] = curr;
                count++;
            }
            curr++;
        }

        System.out.println("Los " + num + " primeros números primos son:");
        for (int i = 0; i < num; i++) {
            System.out.print(primes[i] + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
