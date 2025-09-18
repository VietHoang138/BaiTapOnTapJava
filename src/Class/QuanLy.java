package Class;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

    private ArrayList<TheMuon> ds112;
    public QuanLy() {
        ds112 = new ArrayList<TheMuon>(10);
    }
    public void themTheMuon(TheMuon theMuon112) {
        ds112.add(theMuon112);
    }

    public void nhapDanhSach(Scanner sc112) {
        TheMuon theMuon112;
        System.out.print("Nhap vao so luong the muon: ");
        int n112 = sc112.nextInt();
        sc112.nextLine();
        System.out.println("Nhap vao danh sach:");
        for (int i112 = 0; i112 < n112; i112++) {
            System.out.println("The muon thu " + (i112 + 1) + " la:");
            theMuon112 = new TheMuon();
            theMuon112.nhapThongTin(sc112);
            themTheMuon(theMuon112);
        }
    }

    public void hienThiDanhSachTraCuoiThang() {
        for (TheMuon the112 : ds112) {
            if (the112.getHanTra().getDate() == 31 || the112.getHanTra().getDate() == 30) {
                the112.hienThiThongTin();
            }
        }
    }
}
