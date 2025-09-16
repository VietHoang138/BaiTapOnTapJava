package Testing;

import java.util.Scanner;

import Class.TuyenSinh;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TuyenSinh dsTuyenSinh112 = new TuyenSinh();

        System.out.println("1. Nhap vao danh sach thi sinh: ");
        dsTuyenSinh112.nhapDanhSach(sc);

        System.out.println("Danh sach thi sinh du thi la:");
        dsTuyenSinh112.hienThiDanhSach();

        System.out.print("Nhap so bao danh can tim: ");
        int soBaoDanh112 = sc.nextInt();
        sc.nextLine();

        dsTuyenSinh112.timKiemThiSinh(soBaoDanh112);

        sc.close();
    }

}
