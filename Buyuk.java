import java.util.Scanner;
public class Buyuk {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz:");
        int n= input.nextInt();
        int buyuk=0,kucuk=99999;
        for(int i=1; i<=n;i++)
        {
            System.out.println(i+".sayıyı giriniz:");
            int a=input.nextInt();
            if(a>=buyuk)
                buyuk=a;
            if(a<=kucuk)
                kucuk=a;
        }
        System.out.println("En büyük sayı:"+buyuk);
        System.out.println("En küçük sayı:"+kucuk);

    }
}
