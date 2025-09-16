package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> ds112;

    public KhachSan() {
        ds112 = new ArrayList<KhachTro>(10);
    }

    public void themKhachTro(KhachTro kt112) {
        ds112.add(kt112);
    }

    public void nhapDanhSach(Scanner sc112) {
        KhachTro khach112;

        System.out.print("1. Nhap vao so luong khach: ");
        int n112 = sc112.nextInt();
        sc112.nextLine();

        System.out.println("Nhap vao thong tin khach tro:");
        for (int i112 = 0; i112 < n112; i112++) {
            System.out.println("Khach tro thu " + (i112 + 1) + " la:");
            khach112 = new KhachTro();
            khach112.nhapThongTin(sc112);
            themKhachTro(khach112);
        }
    }

    public void hienThiDanhSach() {
        for (KhachTro khach112 : ds112) {
            khach112.hienThiThongTin();
        }
    }

    public double tinhTien(int CMND112) {
        double tien112 = 0;

        for (KhachTro khach112 : ds112) {
            if (khach112.getCMND() == CMND112) {
                tien112 = khach112.getSoNgayTro() * khach112.getGiaPhong();
            }
        }

        return tien112;
    }
}
