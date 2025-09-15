package Class;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private String bac112;

    public CongNhan() {}

    public CongNhan(String hoTen112, String ngaySinh112, String gioiTinh112, String diaChi112, String bac112) {
        super(hoTen112, ngaySinh112, gioiTinh112, diaChi112);
        this.bac112 = bac112;
    }
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap bac: ");
        bac112 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin112();
        System.out.println("Bac: "+bac112);
    }
}
