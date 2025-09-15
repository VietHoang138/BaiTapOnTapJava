package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh112;
    private int thangPhatHanh112;

    public TapChi() {

    }

    public TapChi(String maTaiLieu112, String tenNXB112, int soBanPhatHanh112, int soPhatHanh112, int thangPhatHanh112) {
        super(maTaiLieu112, tenNXB112, soBanPhatHanh112);
        this.soPhatHanh112 = soBanPhatHanh112;
        this.thangPhatHanh112 = thangPhatHanh112;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap so phat hanh: ");
        soPhatHanh112 = sc.nextInt();
        System.out.print("Nhap thang phat hanh: ");
        thangPhatHanh112 = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So phat hanh: " + soPhatHanh112);
        System.out.println("Thang phat hanh: " + thangPhatHanh112);
    }
}
