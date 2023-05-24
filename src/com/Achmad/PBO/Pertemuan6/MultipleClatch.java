package com.Achmad.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleClatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukan Angka : ");
            int angka1 = input.nextInt();

            System.out.print("Masukan Angka Pembagi : ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil + " dibulatkan");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : kesalahan dalam perhitungan");
        }
        catch (InputMismatchException e) {
            System.out.println("Error : kesalahan dalam input");
        }
        finally {
            System.out.println("finally akan selalu dijalankan");
        }
    }
}
