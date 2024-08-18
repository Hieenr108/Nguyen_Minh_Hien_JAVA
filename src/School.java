public class School {
    private String tenTruong;
    private String ngayVaoTruong;

    public School(){

    }

    public School(String name, String date){
        this.tenTruong = name;
        this.ngayVaoTruong = date;
    }

    public String getTenTruong() {
        return tenTruong;
    }
    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getNgayVaoTruong() {
        return ngayVaoTruong;
    }
    public void setNgayVaoTruong(String ngayVaoTruong) {
        this.ngayVaoTruong = ngayVaoTruong;
    }

}
