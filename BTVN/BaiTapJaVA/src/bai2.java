import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Nhap phan tu mang a: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Mang da nhap la: ");
        for(int i = 0; i < n; i++) {
            System.out.print( a[i] + " ");
        }

        if(a[0]%2 == 1) {
            a[0] = a[0] + a[1];
        }

        for (int i=1; i<n-1 ; i++) {
            if (a[i]%2 == 1) {
                a[i] = a[i] + Math.abs(a[i+1] - a[i-1]);
            }
        }

        if(a[n-1]%2 == 1) {
            a[n-1] = a[n-1] + a[n-2];
        }

        System.out.println("\n");
        System.out.println("Mang sau khi nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
