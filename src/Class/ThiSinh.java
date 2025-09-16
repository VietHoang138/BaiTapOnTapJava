package Class;
import java.util.Scanner;

public class ThiSinh {
    private int soBD112;
    private String hoTen112;
    private String diaChi112;
    private String dienUuTien112;

    public ThiSinh() {

    }

    public ThiSinh(int soBD112, String hoTen112, String diaChi112, String dienUuTien112) {
        this.soBD112 = soBD112;
        this.hoTen112 = hoTen112;
        this.diaChi112 = diaChi112;
        this.dienUuTien112 = dienUuTien112;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap so bao danh: ");
        soBD112 = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen112 = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi112 = sc.nextLine();
        System.out.print("Nhap dien uu tien: ");
        dienUuTien112 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("So bao danh: " + soBD112);
        System.out.println("Ho ten: " + hoTen112);
        System.out.println("Dia chi: " + diaChi112);
        System.out.println("Dien uu tien: " + dienUuTien112);
    }

    public int getSoBD112() {
        return soBD112;
    }
}
