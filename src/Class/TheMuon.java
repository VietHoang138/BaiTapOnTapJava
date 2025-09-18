package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon112;
    private Date ngayMuon112;
    private Date hanTra112;
    private String soHieu112;

    public TheMuon() {}

    public TheMuon(int soMuon112, Date ngayMuon112, String soHieu112) {
        this.soMuon112 = soMuon112;
        this.ngayMuon112 = ngayMuon112;
        this.soHieu112 = soHieu112;
    }

    public void nhapThongTin(Scanner sc112) {
        super.nhapThongTin(sc112);

        System.out.print("\tNhap so muon: ");
        soMuon112 = sc112.nextInt();
        sc112.nextLine();

        System.out.print("\tNhap ngay muon: ");
        String strNgayMuon112 = sc112.nextLine();
        ngayMuon112 = strToDate112(strNgayMuon112);

        String strNgayTra112 = "31-12-2020";
        hanTra112 = strToDate112(strNgayTra112);

        System.out.print("\tNhap so hieu: ");
        soHieu112 = sc112.nextLine();
    }

    private Date strToDate112(String strNgayMuon112) {
        Date date112 = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date112 = sdf.parse(strNgayMuon112);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }
        return date112;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        SimpleDateFormat sdf112 = new SimpleDateFormat("dd-MM-yyyy");
        String ngayMuonStr112 = ngayMuon112 != null ? sdf112.format(ngayMuon112) : "";
        String hanTraStr112 = hanTra112 != null ? sdf112.format(hanTra112) : "";
        System.out.println("\tSo phieu muon: " + soMuon112);
        System.out.println("\tNgay muon: " + ngayMuonStr112);
        System.out.println("\tHan tra: " + hanTraStr112);
        System.out.println("\tSo hieu: " + soHieu112);
    }

    public Date getHanTra() {
        return hanTra112;
    }
}
