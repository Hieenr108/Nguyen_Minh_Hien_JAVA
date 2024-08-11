import java.time.LocalDate;
import java.util.Scanner;

public class Student {
    private String hoTen;
    private String diaChi;
    private double diemTX1;
    private double diemTX2;
    private double diemKTHP;
    private int soTietNghi;
    private int namSinh;

    public Student(String hoTen, int namSinh, String diaChi, double diemTX1,
                   double diemTX2, double diemKTHP, int soTietNghi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.soTietNghi = soTietNghi;
        this.diemTX1 = diemTX1;
        this.diemTX2 = diemTX2;
        this.diemKTHP = diemKTHP;
    }

    public Student(){
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.soTietNghi = soTietNghi;
        this.diemTX1 = diemTX1;
        this.diemTX2 = diemTX2;
        this.diemKTHP = diemKTHP;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTX1() {
        return diemTX1;
    }
    public void setDiemTX1(double diemTX1) {
        this.diemTX1 = diemTX1;
    }

    public double getDiemTX2() {
        return diemTX2;
    }
    public void setDiemTX2(double diemTX2) {
        this.diemTX2 = diemTX2;
    }

    public double getDiemKTHP() {
        return diemKTHP;
    }
    public void setDiemKTHP(double diemKTHP) {
        this.diemKTHP = diemKTHP;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }
    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public int getTuoi(){
        LocalDate localDate = LocalDate.now();
        int nam = LocalDate.now().getYear();
        return nam - getNamSinh();
    }

    public double getGPA(){
        return diemTX1 * 0.2 + diemTX2 * 0.3 + diemKTHP *0.5;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String hoTen = sc.nextLine();
        setHoTen(hoTen);
        System.out.println("Nhập năm sinh: ");
        int namSinh = sc.nextInt();sc.nextLine();
        setNamSinh(namSinh);
        System.out.println("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        setDiaChi(diaChi);
        System.out.println("Nhập điểm TX1: ");
        double tx1 = sc.nextDouble();
        setDiemTX1(diemTX1);
        System.out.println("Nhập điểm TX2: ");
        double tx2 = sc.nextDouble();
        setDiemTX2(diemTX2);
        System.out.println("Nhập điểm KTHP: ");
        double kthp = sc.nextDouble();
        setDiemKTHP(kthp);
        System.out.println("Nhập số tiết nghỉ: ");
        int soTietNghi = sc.nextInt();
        setSoTietNghi(soTietNghi);
    }

    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n",
                "Tên","Tuổi","Địa chỉ","Điểm TX1","Điểm TX2","Điểm KTHP","Điểm GPA","Số tiết nghỉ");
    }

    public void inDuLieu(){
        System.out.printf("%-15s %-15d %-15s %-15f %-15f %-15f %-15f %-15d\n",
                getHoTen(),getTuoi(),getDiaChi(),getDiemTX1(),getDiemTX2(),getDiemKTHP(),
                getGPA(),getSoTietNghi());
    }
}

