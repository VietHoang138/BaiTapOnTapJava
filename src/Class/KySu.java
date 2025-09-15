package Class;

import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao112;

    public KySu() {}

    public KySu(String hoTen112, String ngaySinh112, String gioiTinh112, String diaChi112, String nganhDaoTao112) {
        super(hoTen112, ngaySinh112, gioiTinh112, diaChi112);
        this.nganhDaoTao112 = nganhDaoTao112;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap nganh dao tao: ");
        nganhDaoTao112 = sc.nextLine();
    }

    public void hienThiThongTin(){
        super.hienThiThongTin112();
        System.out.println("Nganh dao tao: "+nganhDaoTao112);
    }
}
