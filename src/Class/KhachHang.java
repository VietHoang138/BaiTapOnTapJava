package Class;
import java.util.Scanner;

public class KhachHang {
    protected String tenChuHo112;
    protected int soNha112;
    protected String maCongTo112;

    public KhachHang() {}

    public KhachHang(String tenChuHo112, int soNha112, String maCongTo112) {
        this.tenChuHo112 = tenChuHo112;
        this.soNha112 = soNha112;
        this.maCongTo112 = maCongTo112;
    }

    public void nhapThongTin(Scanner sc112) {
        System.out.print("\tNhap ten chu ho: ");
        tenChuHo112 = sc112.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha112 = sc112.nextInt();
        sc112.nextLine();
        System.out.print("\tNhap ma cong to: ");
        maCongTo112 = sc112.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tTen chu ho: " + tenChuHo112);
        System.out.println("\tSo nha: " + soNha112);
        System.out.println("\tMa cong to: " + maCongTo112);
    }
}
