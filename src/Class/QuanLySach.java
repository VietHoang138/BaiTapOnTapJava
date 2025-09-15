package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dstl112;

    public QuanLySach() {
        dstl112 = new ArrayList<TaiLieu>(10);
    }

    public void themTaiLieu(TaiLieu tl) {
        dstl112.add(tl);
    }

    public void nhapDanhSachTL(Scanner sc) {
        int chon;
        String stop;
        TaiLieu tl;

        do {
            System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    tl = new Sach();
                    break;
                case 2:
                    tl = new TapChi();
                    break;
                case 3:
                    tl = new Bao();
                    break;

                default:
                    tl = new Sach();
                    break;
            }

            tl.nhapThongTin(sc);
            themTaiLieu(tl);

            System.out.print("Ban co muon nhap vao nua hay khong (c/k): ");
            stop = sc.nextLine();
        } while (stop.equals("c"));
    }

    public void timMaTL(String maTL) {
        for (TaiLieu tl : dstl112) {
            if (maTL.equals(tl.getMaTaiLieu())) {
                tl.hienThiThongTin();
            }
        }
    }

    public void timLoaiTL(String loai) {
        for (TaiLieu tl : dstl112) {
            if (loai.equals("Sach") && (tl instanceof Sach)) {
                tl.hienThiThongTin();
            } else if (loai.equals("TapChi") && (tl instanceof TapChi)) {
                tl.hienThiThongTin();
            } else if (loai.equals("Bao") && (tl instanceof Bao)) {
                tl.hienThiThongTin();
            }
        }
    }
}
