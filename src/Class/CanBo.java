package Class;
import java.util.Scanner;

public class CanBo {

    //thuoc tinh
    private String hoTen112;
    private String ngaySinh112;
    private String gioiTinh112;
    private String diaChi112;

    //phuong thuc
    //ham khoi tao khong doi so
    public CanBo() {}
    //ham khoi tao co doi so
    public CanBo(String hoTen112, String ngaySinh112, String gioiTinh112, String diaChi112) {
        this.hoTen112 = hoTen112;
        this.ngaySinh112 = ngaySinh112;
        this.gioiTinh112 = gioiTinh112;
        this.diaChi112 = diaChi112;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen112 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy) :");
        ngaySinh112 = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh112 = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi112 = sc.nextLine();
    }

    public void hienThiThongTin112() {
        System.out.println("Họ tên: " + hoTen112);
        System.out.println("Ngày sinh: " + ngaySinh112);
        System.out.println("Giới tính: " + gioiTinh112);
        System.out.println("Địa chỉ: " + diaChi112);
    }

    public String getHoTen112() { return this.hoTen112; }
    public void setHoTen112(String hoTen112) { this.hoTen112 = hoTen112; }

    public String getNgaySinh112() { return this.ngaySinh112; }
    public void setNgaySinh112(String ngaySinh112) { this.ngaySinh112 = ngaySinh112; }

    public String getGioiTinh112() { return this.gioiTinh112; }
    public void setGioiTinh112(String gioiTinh112) { this.gioiTinh112 = gioiTinh112; }

    public String getDiaChi112() { return this.diaChi112; }
    public void setDiaChi112(String diaChi112) { this.diaChi112 = diaChi112; }


}
