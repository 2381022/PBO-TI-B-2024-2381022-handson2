package latihan;

import java.util.Scanner;

public class Soal1 {
    // Buatlah sebuah program yang dapat menentukan nilai maksimal dari 2 bilangan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] bilangan = new int[2];

        System.out.print("Masukkan angka pertama : ");
        bilangan[0] = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        bilangan[1] = input.nextInt();

        if (bilangan[0] < bilangan[1]){
            System.out.println("nilai yang paling maksimal adalah : " + bilangan[1]);
        }else {
            System.out.println("nilai yang paling maksimal adalah : " + bilangan[0]);
        }
    }
}
