import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> sinhVien = new ArrayList();

    public static void main(String[] args) {
        fakeData();
        inThongTin();
        sinhVien.clear();
        //
        luachon();
    }

    public static void fakeData(){
        System.out.println("Mẫu nhập dữ liệu: ");
        Student s1 = new Student("Hien", 2005, "QuangNinh", 8, 8, 8,3);
        sinhVien.add(s1);
        Student s2 = new Student("Hai", 2005, "QuangNinh", 8, 9, 8,2);
        sinhVien.add(s2);
        Student s3 = new Student("Hoang", 2005, "Nghe An", 8, 9, 9,5);
        sinhVien.add(s3);
        Student s4 = new Student("Phuong", 2005, "Nam Dinh", 9,9,10,2);
        sinhVien.add(s4);
        Student s5 = new Student("Quan", 2005, "Thanh Hoa", 8, 8 ,8, 3);
        sinhVien.add(s5);
        
    }

    public static void themSinhVien(){
        System.out.println("Số sinh viên bạn muốn thêm là: ");
        int soSV = sc.nextInt();
        for(int i=0; i<soSV; i++){
            Student s = new Student();
            s.nhap();
            sinhVien.add(s);
        }
    }

    public static void suaThongTin(){
            sc.nextLine();
            System.out.println("Nhập tên sinh viên muốn sửa: ");
            String ten = sc.nextLine();
            for (Student sv: sinhVien ) {
                if(sv.getHoTen().equals(ten)){
                    sinhVien.remove(sv);
                    sv.nhap();
                    sinhVien.add(sv);
                }
            }
    }

    public static void xepTheoTuoi(){
        SortbyAge a = new SortbyAge();
        Collections.sort(sinhVien, a);
    }

    public static void xeptheoGPA(){
        SortbyAge g = new SortbyAge();
        Collections.sort(sinhVien, g);
    }

    public static void xeptheoSTN(){
        SortbyAge s = new SortbyAge();
        Collections.sort(sinhVien, s);
    }

    public static void xoaSinhVien(){
        System.out.println("Nhập tên sinh viên muốn xóa kho?i danh sách: ");
        String ten = sc.nextLine();
        if(sinhVien.contains(ten)){
            System.out.println("Thành công! ");
            for (Student sv: sinhVien ) {
                if(sv.getHoTen().equals(ten)){
                    sinhVien.remove(sv);
                }
            }
        }else{
            System.out.println("Không tìm thấy sinh viên có tên như trên! ");
        }
    }

    public static void inThongTin(){
        Student.inTieuDe();
        for(Student sv: sinhVien){
            sv.inDuLieu();
        }
    }
    public static void luachon(){
        while(true){
            System.out.println("1. Thêm sinh viên mới: ");
            System.out.println("2. Sửa thông tin sinh viên: ");
            System.out.println("3. Xếp theo tuổi: ");
            System.out.println("4. Xếp theo GPA: ");
            System.out.println("5. Xếp theo STN: ");
            System.out.println("6. Xóa sinh viên kho?i danh sách: ");
            System.out.println("Nhập vào yêu cầu muốn thực hiện!");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    themSinhVien();
                    inThongTin();
                    break;
                case 2:
                    suaThongTin();
                    inThongTin();
                    break;
                case 3:
                    xepTheoTuoi();
                    inThongTin();
                    break;
                case 4:
                    xeptheoGPA();
                    inThongTin();
                    break;
                case 5:
                    xeptheoSTN();
                    inThongTin();
                    break;
                case 6:
                    xoaSinhVien();
                    inThongTin();
                    break;
            }
        }
    }
}
