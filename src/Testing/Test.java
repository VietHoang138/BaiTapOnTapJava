package Testing;

import java.util.Scanner;

import Class.QLCB;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();

        qlcb.nhapDanhSach(sc);
        System.out.print("2. Nhap vao ho ten can tim kiem: ");
        String name = sc.nextLine();
        System.out.println("3. Thong tin can bo tim duoc: ");

        qlcb.timKiemCanBo(name);

        sc.close();
    }
}
