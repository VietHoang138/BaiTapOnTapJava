package Class;

import java.util.Scanner;

public class NhanVien extends CanBo{
    // thuoc tinh
    private String CongViec112;

    public NhanVien() {}

    public NhanVien(String hoTen112, String ngaySinh112, String gioiTinh112, String diaChi112, String CongViec112) {
        super(hoTen112, ngaySinh112, gioiTinh112, diaChi112);
        this.CongViec112 = CongViec112;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap cong viec: ");
        CongViec112 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin112();
        System.out.println("Cong viec: " + CongViec112);
    }
}
