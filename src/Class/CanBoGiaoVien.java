package Class;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CanBoGiaoVien extends Nguoi {
    private double luongCung112;
    private double thuong112;
    private double phat112;
    private double luongThucLinh112;

    public CanBoGiaoVien() {}

    public void nhapThongTin(Scanner sc112) {
        super.nhapThongTin(sc112);

        System.out.print("\tNhap luong cung: ");
        luongCung112 = sc112.nextDouble();
        sc112.nextLine();

        System.out.print("\tNhap thuong: ");
        thuong112 = sc112.nextDouble();
        sc112.nextLine();

        System.out.print("\tNhap phat: ");
        phat112 = sc112.nextDouble();
        sc112.nextLine();

        luongThucLinh112 = luongCung112 + thuong112 - phat112;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        DecimalFormat df112 = new DecimalFormat("#.################");
        System.out.println("\tLuong cung: " + df112.format(luongCung112));
        System.out.println("\tThuong: " + df112.format(thuong112));
        System.out.println("\tPhat: " + df112.format(phat112));
        System.out.println("\tLuong thuc linh: " + df112.format(luongThucLinh112));
    }

    public double getLuongThucLinh() {
        return luongThucLinh112;
    }
}
