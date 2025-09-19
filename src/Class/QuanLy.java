package Class;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<BienLai> ds112;
    public QuanLy() {
        ds112 = new ArrayList<BienLai>(10);
    }
    public void themBienLai(BienLai bienLai112) {
        ds112.add(bienLai112);
    }
    public void nhapDanhSach(Scanner sc112) {
        BienLai bienLai112;
        System.out.print("1. Nhap vao so luong bien lai: ");
        int n112 = sc112.nextInt();
        sc112.nextLine();
        System.out.println("Nhap vao danh sach bien lai:");
        for (int i112 = 0; i112 < n112; i112++) {
            System.out.println("Bien lai thu " + (i112 + 1) + " la:");
            bienLai112 = new BienLai();
            bienLai112.nhapThongTin(sc112);

            themBienLai(bienLai112);
        }
    }

    public void hienThiDanhSach() {
        for (int i112 = 0; i112 < ds112.size(); i112++) {
            System.out.println("Bien lai thu " + (i112 + 1) + " la:");
            ds112.get(i112).hienThiThongTin();
            System.out.println();
        }
    }
}
