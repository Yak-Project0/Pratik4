import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ucret;
        int km;
        double perKm = 2.20;
        System.out.print("Yolcunun kaç km gittiğini giriniz: ");
        km = scanner.nextInt();
        ucret = 10;
        ucret +=perKm*km;
        ucret = ucret<20 && ucret>0 ? 20 : ucret;
        System.out.println("Ödemeniz gereken miktar: "+ucret);
    }
}