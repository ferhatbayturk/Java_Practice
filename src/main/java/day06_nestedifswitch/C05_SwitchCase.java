package day06_nestedifswitch;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        /*
            * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
        * ornek
        *  Kullanici  : A , B , C harflerinden birini secsin
        A'yi secmis ise, ==> Java kolay
        B'yi secmis ise, ==> Java eglenceli
        C'yi secmis ise, ==> Calismaliyim :)
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen harflerden birini giriniz : \nA\tB\tC");
        char harf = input.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'A':
                System.out.println("Java kolay");
                break;
            case 'B':
                System.out.println("Java eglenceli");
                break;
            case 'C':
                System.out.println("Calismaliyim");
                break;
            default:
                System.out.println("Lutfen gecerli bir harf giriniz...");

        }


    }
}
