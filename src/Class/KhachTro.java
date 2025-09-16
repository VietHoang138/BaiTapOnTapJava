package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
    private int soNgayTro112;
    private String loaiPhong112;
    private double giaPhong112;

    public KhachTro() {

    }

    public KhachTro(String hoTen112, int CMND112, int soNgayTro112, String loaiPhong112, double giaPhong112) {
        this.hoTen112 = hoTen112;
        this.CMND112 = CMND112;
        this.soNgayTro112 = soNgayTro112;
        this.loaiPhong112 = loaiPhong112;
        this.giaPhong112 = giaPhong112;
    }

    public void nhapThongTin(Scanner sc112) {
        super.nhapThongTin(sc112);

        System.out.print("\tNhap so ngay tro: ");
        soNgayTro112 = sc112.nextInt();
        sc112.nextLine();
        System.out.print("\tNhap loai phong: ");
        loaiPhong112 = sc112.nextLine();
        System.out.print("\tNhap gia phong: ");
        giaPhong112 = sc112.nextDouble();
        sc112.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tSo ngay tro: " + soNgayTro112);
        System.out.println("\tLoai phong: " + loaiPhong112);
        System.out.println("\tGia phong: " + giaPhong112);
    }

    public int getSoNgayTro() {
        return soNgayTro112;
    }

    public double getGiaPhong() {
        return giaPhong112;
    }
}
