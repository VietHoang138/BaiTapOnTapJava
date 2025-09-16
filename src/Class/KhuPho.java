package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> dshd112;

    public KhuPho() {
        dshd112 = new ArrayList<HoDan>(10);
    }

    public void themHoDan(HoDan hoDan112) {
        dshd112.add(hoDan112);
    }

    public void nhapDanhSach(Scanner sc) {
        HoDan hoDan112;

        System.out.print("Nhap vao so ho dan: ");
        int soHoDan112 = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap vao thong tin cho tung ho dan:");
        for (int i112 = 0; i112 < soHoDan112; i112++) {
            System.out.println("Ho dan thu " + (i112 + 1) + " la:");
            hoDan112 = new HoDan();
            hoDan112.nhapThongTin(sc);
            themHoDan(hoDan112);
        }
    }

    public void hienThiDanhSach() {
        int n112 = dshd112.size();

        for (int i112 = 0; i112 < n112; i112++) {
            System.out.println("Ho dan thu " + (i112 + 1) + " la:");
            dshd112.get(i112).hienThiThongTin();
        }
    }

    public void timKiemThongTin() {
        Date now112 = new Date();
        int namHienTai112 = now112.getYear() + 1900;

        Nguoi[] dstv112 = null;

        for (HoDan hoDan112 : dshd112) {
            dstv112 = hoDan112.getList();
            for (int i112 = 0; i112 < hoDan112.getSoNguoi(); i112++) {
                if (namHienTai112 - (dstv112[i112].getNgaySinh().getYear() + 1900) == 80) {
                    hoDan112.hienThiThongTin();
                }
            }
        }
    }
}
