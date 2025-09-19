package Class;
import java.util.Scanner;

public class BienLai extends KhachHang {
    private int chiSoMoi112;
    private int chiSoCu112;
    private double tien112;

    public BienLai() {}

    public BienLai(int chiSoMoi112, int chiSoCu112, double tien112) {
        this.chiSoMoi112 = chiSoMoi112;
        this.chiSoCu112 = chiSoCu112;
        this.tien112 = tien112;
    }

    public BienLai(String tenChuHo112, int chiSoMoi112, int chiSoCu112, double tien112) {
        this.tenChuHo112 = tenChuHo112;
        this.chiSoMoi112 = chiSoMoi112;
        this.chiSoCu112 = chiSoCu112;
        this.tien112 = tien112;
    }

    public void nhapThongTin(Scanner sc112) {
        super.nhapThongTin(sc112);
        System.out.print("\tNhap chi so moi: ");
        chiSoMoi112 = sc112.nextInt();
        sc112.nextLine();
        System.out.print("\tNhap chi so cu: ");
        chiSoCu112 = sc112.nextInt();
        sc112.nextLine();
        tien112 = (chiSoMoi112 - chiSoCu112) * 750;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tChi so moi: " + chiSoMoi112);
        System.out.println("\tChi so cu: " + chiSoCu112);
        System.out.println("3. So tien phai tra: " + tien112);
    }
}
