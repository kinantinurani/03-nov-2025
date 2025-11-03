import java.util.Scanner;

public class HitungFaktorial {
    // Fungsi untuk menghitung faktorial
    static int faktorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

        int hasil = faktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);

        input.close();
    }
}

