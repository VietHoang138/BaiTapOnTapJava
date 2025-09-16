package Class;
import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<ThiSinh> dsts112;

    public TuyenSinh() {
        dsts112 = new ArrayList<ThiSinh>(10);
    }

    public void themThiSinh(ThiSinh ts112) {
        dsts112.add(ts112);
    }

    public void nhapDanhSach(Scanner sc) {
        ThiSinh ts112;
        int chon112;

        System.out.print("Nhap vao so luong thi sinh: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
            chon112 = sc.nextInt();

            switch (chon112) {
                case 1:
                    ts112 = new KhoiA("Toan", "Ly", "Hoa");
                    break;
                case 2:
                    ts112 = new KhoiB("Toan", "Hoa", "Sinh");
                    break;
                case 3:
                    ts112 = new KhoiC("Van", "Su", "Dia");
                    break;
                default:
                    ts112 = new KhoiA("Toan", "Ly", "Hoa");
                    break;
            }

            ts112.nhapThongTin(sc);
            themThiSinh(ts112);
        }
    }

    public void hienThiDanhSach() {
        int n = dsts112.size();
        for (int i = 0; i < n; i++) {
            System.out.println("Thi sinh thu " + (i + 1) + " la:");
            dsts112.get(i).hienThiThongTin();
        }
    }

    public void timKiemThiSinh(int soBaoDanh112) {
        for (ThiSinh ts112 : dsts112) {
            if (ts112.getSoBD112() == soBaoDanh112) {
                ts112.hienThiThongTin();
            }
        }
    }
}
