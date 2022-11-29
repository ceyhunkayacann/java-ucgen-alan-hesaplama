import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        int k1,k2,k3;
        double u;
        double alan;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenar : ");
        k1 = input.nextInt();
        System.out.print("2. Kenar : ");
        k2 = input.nextInt();
        System.out.print("3. Kenar : ");
        k3 = input.nextInt();

        u = (k1+k2+k3) / 2;

        alan = Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));

        System.out.println("Üçgenin Alanı : " + alan);

    }
}
