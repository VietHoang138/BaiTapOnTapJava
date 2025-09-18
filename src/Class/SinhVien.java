package Class;
import java.util.Scanner;

public class SinhVien {
    protected String hoTen112;
    protected String maSV112;
    protected String ngaySinh112;
    protected String lop112;

    public SinhVien() {}

    public SinhVien(String hoTen112, String maSV112, String ngaySinh112, String lop112) {
        this.hoTen112 = hoTen112;
        this.maSV112 = maSV112;
        this.ngaySinh112 = ngaySinh112;
        this.lop112 = lop112;
    }

    public void nhapThongTin(Scanner sc112) {
        System.out.print("\tNhap ho ten: ");
        hoTen112 = sc112.nextLine();

        System.out.print("\tNhap ma sinh vien: ");
        maSV112 = sc112.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        ngaySinh112 = sc112.nextLine();

        System.out.print("\tNhap lop: ");
        lop112 = sc112.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen112);
        System.out.println("\tNgay sinh: " + ngaySinh112);
        System.out.println("\tMa sinh vien: " + maSV112);
        System.out.println("\tLop: " + lop112);
    }
}
