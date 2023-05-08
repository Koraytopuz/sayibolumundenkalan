import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program");

        Scanner input = new Scanner(System.in);

        int k;
        int sum = 0;
        int count = 0;
        double avg;
        System.out.println("sayı giriniz:");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;

            }

        }
        avg = sum / count;
        System.out.println(avg);

    }
}

