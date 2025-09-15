package Class;
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb112;

    public QLCB() {
        dscb112 = new ArrayList<CanBo>(10);
    }

    public void themCanBo(CanBo cb) {
        dscb112.add(cb);
    }

    public void nhapDanhSach(Scanner sc){
        CanBo cb;
        System.out.print("Nhap vao so luong can bo: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("1. Nhap thong tin chi tiet: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu: "+(i+1)+ ":");
            System.out.print("Chon can bo (1-Ky su; 2-Nhan vien; 3-CongNhan): ");
            int Chon=sc.nextInt(); sc.nextLine();
            cb = new CanBo();

            switch (Chon) {
                case 1:
                    cb = new KySu();
                    break;
                case 2:
                    cb = new NhanVien();
                    break;
                case 3:
                    cb = new CongNhan();
                    break;
                default:
                    cb = new KySu();
                    break;
            }
            cb.nhapThongTin(sc);

            themCanBo(cb);
        }
    }

    public void timKiemCanBo(String hoTen){
        for(CanBo cb : dscb112){
            if(cb.getHoTen112().equalsIgnoreCase(hoTen.trim())){
                cb.hienThiThongTin112();
            }
        }
    }
}
