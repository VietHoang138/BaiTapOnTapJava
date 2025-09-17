package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class HSHocSinh {
    private ArrayList<HocSinh> dshs112;

    public HSHocSinh() {
        dshs112 = new ArrayList<HocSinh>(10);
    }

    public void themHS(HocSinh hs112) {
        dshs112.add(hs112);
    }

    public void nhapDanhSachHS(Scanner sc112) {
        HocSinh hs112;
        System.out.print("1. Nhap vao so luong hoc sinh: ");
        int n112 = sc112.nextInt();
        sc112.nextLine();
        System.out.println("- Nhap thong tin cho hoc sinh trong danh sach:");
        for (int i112 = 0; i112 < n112; i112++) {
            System.out.println("\tHoc sinh thu " + (i112 + 1) + " la:");
            hs112 = new HocSinh();
            hs112.nhapThongTin(sc112);
            themHS(hs112);
        }
    }

    public void hienThiDanhSach() {
        int n112 = dshs112.size();
        for (int i112 = 0; i112 < n112; i112++) {
            System.out.println("\tHoc sinh thu " + (i112 + 1) + " la:");
            dshs112.get(i112).hienThiThongTin();
        }
    }

    public void timKiemThongTin(int nam112, String que112) {
        boolean found112 = false;
        for (HocSinh hs112 : dshs112) {
            if ((hs112.getNgaySinh().getYear() + 1900 == nam112) && (que112.equals(hs112.getQueQuan()))) {
                hs112.hienThiThongTin();
                found112 = true;
            }
        }
        if (!found112) {
            System.out.println("\tKhong co hoc sinh phu hop.");
        }
    }

    public void timKiemThongTin(String lop112) {
        boolean found112 = false;
        for (HocSinh hs112 : dshs112) {
            if (lop112.equals(hs112.getLop())) {
                hs112.hienThiThongTin();
                found112 = true;
            }
        }
        if (!found112) {
            System.out.println("\tKhong co hoc sinh phu hop.");
        }
    }
}
