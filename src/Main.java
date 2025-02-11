import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ucret;
        int gidilenYolKM;
        System.out.print("Yolcunun kaç km gittiğini giriniz: ");
        gidilenYolKM = scanner.nextInt();
        ucret = 10;
        ucret +=2.20*gidilenYolKM;
        ucret = ucret<20 && ucret>0 ? 20 : ucret;
        System.out.println("Ödemeniz gereken miktar: "+ucret);
    }
}