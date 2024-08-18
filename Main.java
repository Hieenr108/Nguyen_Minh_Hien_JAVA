import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<May> dsMay = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static PhongMay p = new PhongMay();
    //
    public static void main(String[] args) {
        nhapDSMay();
        inThongTin();
    }

    public static void nhapDSMay(){
        p.nhap();
        for(int i = 0; i<p.getPhongMay(); i++){
            May y = new May();
            y.nhap();
            dsMay.add(y);
        }
        System.out.println("Thành công!");
    }

    public static void inMay(){
        System.out.printf("%-15s %-15s %-15s\n", "Mã máy", "Tên máy", "Tình trạng");
        for (May m: dsMay){
            m.xuat();
        }
    }

    public static void inThongTin(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Mã phòng", "Tên phòng", "Diện tích", "Mã quản lý", "Họ tên");
        p.xuat();
        inMay();
    }
}