package Class;
import java.util.Scanner;

public class HocSinh extends Nguoi {
    private String lop112;
    private String khoHoc112;
    private String kyHoc112;

    public HocSinh() {}

    public HocSinh(String hoTen112, String lop112, String khoaHoc112, String kyHoc112) {
        this.hoTen112 = hoTen112;
        this.lop112 = lop112;
        this.khoHoc112 = khoaHoc112;
        this.kyHoc112 = kyHoc112;
    }

    public void nhapThongTin(Scanner sc112) {
        super.nhapThongTin(sc112);
        System.out.print("\tNhap lop: ");
        lop112 = sc112.nextLine();
        System.out.print("\tNhap khoa hoc: ");
        khoHoc112 = sc112.nextLine();
        System.out.print("\tNhap ky hoc: ");
        kyHoc112 = sc112.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tLop: " + lop112);
        System.out.println("\tKhoa hoc: " + khoHoc112);
        System.out.println("\tKy hoc: " + kyHoc112);
    }

    public String getLop() {
        return lop112;
    }
}
