import java.util.Scanner;

public class HitungFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan bilangan
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        // Validasi input
        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1;

            // Menghitung faktorial
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }

            // Menampilkan hasil
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }

        input.close();
    }
}