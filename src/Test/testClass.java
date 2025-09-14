package Test;
import Class.PhanSo;

import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhap vao phan so thu nhat: ");
        ps1.nhapPS(sc);
        System.out.println("Nhap vao phan so thu hai: ");
        ps2.nhapPS(sc);

        // hien thi phan so
        System.out.print("Phan so thu nhat la: ");
        ps1.hienThiPS();
        System.out.print("Phan so thu hai la: ");
        ps2.hienThiPS();

        // Cong
        PhanSo psTong = ps1.congPS(ps2);
        System.out.print("Tong ps1 + ps2 = ");
        psTong.hienThiPS();

        // Tru
        PhanSo psHieu = ps1.truPS(ps2);
        System.out.print("Hieu ps1 - ps2 = ");
        psHieu.hienThiPS();

        // Nhan
        PhanSo psTich = ps1.nhanPS(ps2);
        System.out.print("Tich ps1 * ps2 = ");
        psTich.hienThiPS();

        // Chia
        PhanSo psThuong = ps1.chiaPS(ps2);
        System.out.print("Thuong ps1 / ps2 = ");
        psThuong.hienThiPS();

        // Kiem tra toi gian
        System.out.println("\nKiem tra toi gian:");
        System.out.println("Phan so 1 " + (ps1.kiemTraToiGian() ? "da toi gian" : "chua toi gian"));
        System.out.println("Phan so 2 " + (ps2.kiemTraToiGian() ? "da toi gian" : "chua toi gian"));

        // toi gian phan so
        System.out.println("\nToi gian phan so neu chua toi gian:");
        System.out.print("Phan so 1 toi gian: ");
        ps1.toiGianPS();
        ps1.hienThiPS();

        System.out.print("Phan so 2 toi gian: ");
        ps2.toiGianPS();
        ps2.hienThiPS();

        sc.close();
    }
}
