import java.util.Scanner;

public class Student {
    private String tenSV;
    private String lopHoc;
    private double diemSo;
    Faculty y = new Faculty();

    public Student(){
        this.y = new Faculty();
    }

    public Student(String name, String classID, double score, Faculty y){
        this.tenSV = name;
        this.lopHoc = classID;
        this.diemSo = score;
        this.y = new Faculty();
    }

    public String getTenSV() {
        return tenSV;
    }
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getLopHoc() {
        return lopHoc;
    }
    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public double getDiemSo() {
        return diemSo;
    }
    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }

    public void nhap(){
        y.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        tenSV = sc.nextLine();
        System.out.println("Nhập lớp học: ");
        lopHoc = sc.nextLine();
        System.out.println("Nhập điểm số: ");
        diemSo = sc.nextDouble(); sc.nextLine();
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
    }

    public void xuat(){
        y.xuat();
        System.out.printf("%-20s %-15s %-15.2f\n", tenSV, lopHoc, diemSo);
    }


}
