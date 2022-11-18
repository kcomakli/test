package day15_exeptionsabstraction;
import static day15_exeptionsabstraction.Kayit.counter;
public class Runner {
    public static void main(String[] args) {
        Kayit obj=new Kayit();
        obj.kayit();
        System.out.println(counter+ "kez dogru kulanici girisi yapildi");
    }
}