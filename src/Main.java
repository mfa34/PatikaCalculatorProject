import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2 , select ;
        // input alinmasi
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("lutfen ilk sayiyi giriniz.");
        n1 = input.nextInt();
        System.out.print("Lutfen ikinci sayiyi giirniz");
        n2 = input.nextInt();

        System.out.println("1- Toplama \n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminiz nedir?");
        select= input.nextInt();

        switch (select){

            case 1:
                System.out.println("Toplam =" + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuc =" + (n1 - n2));
                break;
            case 3 :
                System.out.println("Carpma isleminin sonucu = " + (n1*n2));
                break;
            case 4 :
                if (n1 != 0){
                    System.out.println(n1 / n2);
                }
                else {
                    System.out.println("0'a bolunmez");
                }
                break;
            default:
                System.out.println("Hatali bir giris gerceklestirdirdiniz.");
        }


    }
}
