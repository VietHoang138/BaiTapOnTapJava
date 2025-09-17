package Class;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen112;
    protected String ngaySinh112;
    protected String queQuan112;

    public Nguoi() {}

    public Nguoi(String hoTen112, String ngaySinh112, String queQuan112) {
        this.hoTen112 = hoTen112;
        this.ngaySinh112 = ngaySinh112;
        this.queQuan112 = queQuan112;
    }

    public void nhapThongTin(Scanner sc112) {
        System.out.print("\tNhap ho ten: ");
        hoTen112 = sc112.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        ngaySinh112 = sc112.nextLine();
        System.out.print("\tNhap que quan: ");
        queQuan112 = sc112.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen112);
        System.out.println("\tNgay sinh: " + ngaySinh112);
        System.out.println("\tQue quan: " + queQuan112);
    }
}
