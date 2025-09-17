package Class;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<CanBoGiaoVien> ds112;

    public QuanLy() {
        ds112 = new ArrayList<CanBoGiaoVien>(10);
    }

    public void themCBGV(CanBoGiaoVien canBo112) {
        ds112.add(canBo112);
    }

    public void nhapDanhSach(Scanner sc112) {
        CanBoGiaoVien canBo112;

        System.out.print("Nhap vao so luong can bo: ");
        int n112 = sc112.nextInt();
        sc112.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i112 = 0; i112 < n112; i112++) {
            System.out.println("Can bo thu " + (i112 + 1) + " la:");
            canBo112 = new CanBoGiaoVien();
            canBo112.nhapThongTin(sc112);
            themCBGV(canBo112);
        }
    }

    public void hienThiDanhSach() {
        for (CanBoGiaoVien cb112 : ds112) {
            cb112.hienThiThongTin();
        }
    }

    public void timKiem(double luong112) {
        for (CanBoGiaoVien cb112 : ds112) {
            if (cb112.getLuongThucLinh() >= luong112) {
                cb112.hienThiThongTin();
            }
        }
    }
}
