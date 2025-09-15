package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh112;

    public Bao() {

    }

    public Bao(String maTaiLieu112, String tenNXB112, int soBanPhatHanh112, String ngayPhatHanh112) {
        super(maTaiLieu112, tenNXB112, soBanPhatHanh112);
        this.ngayPhatHanh112 = ngayPhatHanh112;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap ngay phat hanh: ");
        ngayPhatHanh112 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh112);
    }
}

