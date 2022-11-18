package day08_loops;

import java.util.Scanner;

public class C06_NestedLoop {
    /*
     *
     * *
     *   *
     *     *
     *********
     */
    // Sekilde gorulen ucgeni yazdiriniz
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {//satir kontrolu
            for (int j = 1; j <= 9; j++) {//sutun kontrolu
                if ((i == 1 && j == 5) || (i == 2 && (j == 4 || j == 6)) || (i == 3 && (j == 3 || j == 7)) || (i == 4 && (j == 2 || j == 8)) || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    /*

                ooooo*
                oooo* *
                ooo*   *
                oo*     *
                o* * * * *


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisi giriniz...");
        int satir = input.nextInt();


        for (int i = 1; i <= satir; i++) {

            for (int bosluk = satir; bosluk >= i; bosluk--) {//bosluk kontrol konsoldan uzaklastir en ust satirdaki 5 ,4 ,3  soldaki bosluk
                System.out.print(" ");//o
            }
            for (int sutun = 1; sutun <= i; sutun++) {

                if (sutun == 1 || sutun == i) {
                    System.out.print("* ");//en distaki yildizlar
                } else if (i == satir) {
                    System.out.print("* ");//en alt satirdaki bosluk
                } else
                    System.out.print("  ");//3. ve  4. satirdaki bosluklar
            }
            System.out.println();
        }

    }
}
