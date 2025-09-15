package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tacGia112;
    private int soTrang112;

    public Sach() {

    }

    public Sach(String maTaiLieu112, String tenNXB112, int soBanPhatHanh112, String tacGia112, int soTrang112) {
        super(maTaiLieu112, tenNXB112, soBanPhatHanh112);
        this.tacGia112 = tacGia112;
        this.soTrang112 = soTrang112;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap tac gia: ");
        tacGia112 = sc.nextLine();
        System.out.print("Nhap so trang: ");
        soTrang112 = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("tac gia: " + tacGia112);
        System.out.println("So trang: " + soTrang112);
    }
}
