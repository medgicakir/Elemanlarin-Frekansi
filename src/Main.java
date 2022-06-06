import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olsun:");
        int diziEleman = inp.nextInt();

        int[] dizi = new int[diziEleman];
        int counter;
        for (int i = 0; i < diziEleman; i++) {
            System.out.print(i + 1 + ". elemanı giriniz: ");
            dizi[i] = inp.nextInt();
        }

        for (int i = 0; i < diziEleman; i++) {
            counter = 0;
            for (int j = i; j < diziEleman; j++) {
                if (i != j && dizi[i] == dizi[j] && dizi[j] != 0) {
                    counter++;
                    dizi[j] = 0;
                }
            }
            if (counter != 0) {
                System.out.println(dizi[i] + " sayısı " + (counter + 1) + " kere tekrar etti.");
            }

        }
    }
}