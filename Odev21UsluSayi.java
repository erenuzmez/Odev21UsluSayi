package CDonguler;
import java.util.Scanner;
public class Odev21UsluSayi {
    public static void main(String[] args) {
        int a,b,i,total=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Üssü alınacak sayı:");
        a= input.nextInt();
        System.out.println("Üs olacak sayı:");
        b=input.nextInt();
        for(i=1;i<=b;i++){
            total=total*a;
        }
        System.out.println("Cevap:"+carpim);
    }
}
