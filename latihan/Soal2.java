package latihan;

import java.util.Scanner;

public class Soal2 {
    // Buatlah sebuah program yang dapat menentukan nilai maksimal dari 3 bilangan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] bilangan = new int[3];

        System.out.print("Masukkan angka pertama : ");
        bilangan[0] = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        bilangan[1] = input.nextInt();
        System.out.print("Masukkan angka ketiga : ");
        bilangan[2] = input.nextInt();

        if (bilangan[0] > bilangan[1] && bilangan[0] > bilangan[2]){
            System.out.println("nilai yang paling maksimal adalah : " + bilangan[0]);
        }else if(bilangan[1] > bilangan[2]){
            System.out.println("nilai yang paling maksimal adalah : " + bilangan[1]);
        }else {
            System.out.println("nilai yang paling maksimal adalah : " + bilangan[2]);
        }
    }

}
