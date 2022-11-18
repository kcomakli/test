package day13_overridingoverloadingstatickeywords;

public class C02_Overloading {

    public static void main(String[] args) {

        //Ayni class da ayni isimde method olusturmak icin method signature degistirilir.

        cikarma(98, (float) 52.666);
        cikarma(14.5, 3);

    }//main

    private static void cikarma(double v, int i) {

        System.out.println("double ile int cikarma yontemi" + (v - i));//double ile int cikarma yontemi11.5
    }

    private static void cikarma(int i, float v) {

        System.out.println("int bir deger ile float cikrma yonetimi calisti " + (i - v));
    }
}