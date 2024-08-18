import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May(){

    }

    public May(String maMay, String tenMay, String tinhTrang){
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }
    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }
    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        maMay = sc.nextLine();
        System.out.println("Nhập tên máy: ");
        tenMay = sc.nextLine();
        System.out.println("Nhập tình trạng: ");
        tinhTrang = sc.nextLine();
        System.out.println("-----------------");
    }

    public void xuat(){
        System.out.printf("%-15s %-15s %-15s\n", maMay, tenMay, tinhTrang);
    }

}
