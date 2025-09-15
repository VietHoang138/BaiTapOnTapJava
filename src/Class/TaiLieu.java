package Class;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu112;
    private String tenNXB112;
    private int soBanPhatHanh112;

    public TaiLieu() {}

    public TaiLieu(String maTaiLieu112, String tenNXB112, int soBanPhatHanh112) {
        this.maTaiLieu112 = maTaiLieu112;
        this.tenNXB112 = tenNXB112;
        this.soBanPhatHanh112 = soBanPhatHanh112;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma tai lieu: ");
        maTaiLieu112 = sc.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        tenNXB112 = sc.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        soBanPhatHanh112 = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ma tai lieu: " + maTaiLieu112);
        System.out.println("Ten nha xuat ban: " + tenNXB112);
        System.out.println("So ban phat hanh: " + soBanPhatHanh112);
    }

    public String getMaTaiLieu() {
        return maTaiLieu112;
    }
}
