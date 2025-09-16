package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    private String monA112;
    private String monB112;
    private String monC112;

    public KhoiA() {}

    public KhoiA(String monA112, String monB112, String monC112) {
        this.monA112 = monA112;
        this.monB112 = monB112;
        this.monC112 = monC112;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap mon 1: ");
        monA112 = sc.nextLine();
        System.out.print("Nhap mon 2: ");
        monB112 = sc.nextLine();
        System.out.print("Nhap mon 3: ");
        monC112 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("To hop mon thi: " + monA112 + " - " + monB112 + " - " + monC112);
    }
}
