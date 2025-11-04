import java.util.Scanner;

public class VolumeTabung {
    
    // Fungsi untuk menghitung volume tabung
    static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        // Memanggil fungsi untuk menghitung volume
        double volumeTabung = hitungVolume(r, t);

        // Menampilkan hasil
        System.out.printf("Volume tabung dengan jari-jari %.2f cm dan tinggi %.2f cm adalah: %.2f cm³\n",
                          r, t, volumeTabung);

        input.close();
    }
}
