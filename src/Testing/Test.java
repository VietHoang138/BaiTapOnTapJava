package Testing;

import java.util.Scanner;

import Class.QuanLySach;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLySach qls112 = new QuanLySach();

        qls112.nhapDanhSachTL(sc);

        System.out.print("2. Nhap vao loai tai lieu can tim: ");
        String loai112 = sc.nextLine();
        qls112.timLoaiTL(loai112);

        System.out.print("3. Nhap vao ma tai lieu can tim: ");
        String maTL112 = sc.nextLine();

        System.out.println("4. Thong tin tai lieu tim duoc: ");
        qls112.timMaTL(maTL112);

        sc.close();
    }

}
