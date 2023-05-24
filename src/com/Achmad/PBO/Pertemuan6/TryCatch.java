package com.Achmad.PBO.Pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
        int[] angka = {
                1,2,3,4,5
        };
        System.out.println(
                "Index ke 4 ada "
        );
        try{
            //memanggil array berdasarkan index
            System.out.println(
                    "yaitu : "+ angka[4]
            );
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "Index yang anda masukan melebihi batas!"
            );
        }
        try{
            //memanggil array berdasarkan index
            System.out.println(
                    angka[6]
            );
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "Index yang anda masukan melebihi batas!"
            );
        }
    }
}
