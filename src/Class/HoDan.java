package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    private int soNguoi112;
    private int soNha112;
    private Nguoi[] list112;

    public HoDan() {
        list112 = new Nguoi[10];
    }

    public HoDan(String hoTen112, Date ngaySinh112, String ngheNghiep112, int soNguoi112, int soNha112) {
        super(hoTen112, ngaySinh112, ngheNghiep112);
        this.soNguoi112 = soNguoi112;
        this.soNha112 = soNha112;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap so nguoi: ");
        soNguoi112 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha112 = sc.nextInt();
        sc.nextLine();
        System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
        for (int i112 = 0; i112 < soNguoi112; i112++) {
            System.out.println("Nguoi thu " + (i112 + 1) + " la:");
            list112[i112] = new Nguoi();
            list112[i112].nhapThongTin(sc);
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tSo nguoi: " + soNguoi112);
        System.out.println("\tSo nha: " + soNha112);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
        for (int i112 = 0; i112 < soNguoi112; i112++) {
            System.out.println("Nguoi thu " + (i112 + 1) + " la:");
            list112[i112].hienThiThongTin();
        }
    }

    public Nguoi[] getList() {
        return list112;
    }

    public int getSoNguoi() {
        return soNguoi112;
    }
}
