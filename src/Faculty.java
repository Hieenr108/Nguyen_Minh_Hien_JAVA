import java.util.Scanner;

public class Faculty {
    private String tenKhoa;
    private String ngayVaoKhoa;
    School x = new School();

    public Faculty(){
        this.x = new School();
    }

    public Faculty(String name, String date, School x){
        this.tenKhoa = name;
        this.ngayVaoKhoa = date;
        this.x = new School();
    }

    public String getTenKhoa() {
        return tenKhoa;
    }
    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getNgayVaoKhoa() {
        return ngayVaoKhoa;
    }
    public void setNgayVaoKhoa(String ngayVaoKhoa) {
        this.ngayVaoKhoa = ngayVaoKhoa;
    }

    public School getX() {
        return x;
    }
    public void setX(School x) {
        this.x = x;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên trường: ");
        x.setTenTruong(sc.nextLine());
        System.out.println("Nhập ngày vào trường: ");
        x.setNgayVaoTruong(sc.nextLine());
        System.out.println("Nhập tên khoa: ");
        tenKhoa = sc.nextLine();
        System.out.println("Ngày vào khoa: ");
        ngayVaoKhoa = sc.nextLine();
    }

    public void xuat(){
        System.out.printf("%-15s %-20s %-15s %-21s", x.getTenTruong(), x.getNgayVaoTruong(), tenKhoa, ngayVaoKhoa);
    }
}
