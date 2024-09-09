package latihan;

import java.util.Scanner;

public class Soal3 {
    // buatlah sebuah program kalkulator sederhana dengan operator(+, -, *, /, %,)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih operasi yang inginkan");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("5. Modulo (%)");
        System.out.print("Masukkan pilihan operasi sesuai simbol : ");
        char simbol = input.next().charAt(0);

        System.out.println("Masukkan bilangan pertama : ");
        int bil1 = input.nextInt();

        System.out.println("Masukkan bilangan pertama : ");
        int bil2 = input.nextInt();

        switch (simbol){
            case '+':
                System.out.println("Hasil Panjumlahan = " + (bil1 + bil2));
                break;
            case '-':
                System.out.println("Hasil Pengurangan = " + (bil1 - bil2));
                break;
            case '*':
                System.out.println("Hasil Perkalian = " + (bil1 * bil2));
                break;
            case '/':
                if (bil2 != 0) {
                    System.out.println("Hasil Pembagian = " + (bil1 / bil2));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            case '%':
                System.out.println("Hasil Modulo = " + (bil1 % bil2));
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
        input.close();
    }
}
