package ternaryoperator;

public class TernaryOperator {
    public static void main(String[] args) {
        int nilai = 75;
        String gradeNIlaiPbo = "A";
        String hasil = gradeNIlaiPbo.equals("A") ? "lulus" : "Tidak Lulus";

        String outputHasil= "Hasil ujian : ";
        System.out.println(outputHasil.concat(hasil));

        System.out.println("1" + 1);
    }
}
