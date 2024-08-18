import java.util.PrimitiveIterator;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private May y;
    private int n;

    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }
    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }
    public void setX(QuanLy x) {
        this.x = x;
    }

    public May getY() {
        return y;
    }
    public void setY(May y) {
        this.y = y;
    }

    public int getPhongMay() {
        return n;
    }
    public void setPhongMay(int n) {
        this.n = n;
    }

    public PhongMay(){
        this.x =new QuanLy();
        this.y = new May();
    }



    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May y, int n){
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã phòng: ");
        maPhong =sc.nextLine();
        System.out.println("Nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.println("Nhập diện tích: ");
        dienTich = sc.nextDouble();
        x.nhap();
        System.out.println("Nhập số lượng máy: ");
        n = sc.nextInt();
    }

    public void xuat(){
        System.out.printf("%-15s %-15s %-16f", maPhong, tenPhong, dienTich);
        x.xuat();
    }
}
