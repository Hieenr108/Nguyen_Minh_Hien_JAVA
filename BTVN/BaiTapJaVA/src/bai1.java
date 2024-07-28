import java.util.Scanner;


public class bai1 {
    public static void main(String[] args) {
        final double pi = 3.14;
        double r;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao ban kinh r: ");
            r = sc.nextDouble();
            if(r<=0||r>=1000) System.out.println("không đúng phạm vi giá trị! \nXin mời nhập lại:");
        }while (r<=0||r>=1000);
        double chuVi = 2*pi*r;
        double dienTich = pi*r*r;
        System.out.println((double) Math.round(chuVi*1000)/1000+" "+(double) Math.round(dienTich*1000)/1000);
    }
}