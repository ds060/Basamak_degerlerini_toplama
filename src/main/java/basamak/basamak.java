package basamak;

import java.util.Scanner;

public class basamak {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
int num;
int total=0;
        System.out.println("sayý giriniz");
        num= inp.nextInt();
        while (num!=0){
            total+=num%10;
            num/=10;
        }
            System.out.println("girilen sayýnýn basamak toplamý:" + total);






    }
}
