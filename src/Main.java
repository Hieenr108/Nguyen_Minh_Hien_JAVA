import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> dsSV = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    //
    public static void main(String[] args) {
        nhapDSSV();
        inThongTin();
    }

    public static void inTieuDe(){
        System.out.printf("%-15s %-20s %-15s %-20s %-20s %-15s %-15s\n", "Tên trường", "Ngày vào trường", "Tên khoa",
                "Ngày vào khoa", "Tên sinh viên", "Lớp học", "Điểm số");
    }

    public static void inThongTin(){
        inTieuDe();
        for(Student s: dsSV )
            s.xuat();
    }

    public static void nhapDSSV(){
        System.out.println("Nhập số lượng sinh viên: ");
        int soSV = sc.nextInt();
        for(int i = 0; i<soSV; i++){
            Student s = new Student();
            s.nhap();
            dsSV.add(s);
        }
            System.out.println("Thành công!");
    }
}