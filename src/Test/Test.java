package Test;
import java.util.Scanner;
import Class.KhachSan;

public class Test {

    public static void main(String[] args) {
        Scanner sc112 = new Scanner(System.in);

        KhachSan ql112 = new KhachSan();

        ql112.nhapDanhSach(sc112);
        System.out.println("2. Danh sach khach tro hien tai:");
        ql112.hienThiDanhSach();

        System.out.print("3. Nhap vao CMND cua khach tro can tinh tien: ");
        int cmnd112 = sc112.nextInt();

        System.out.println("Tong tien la: " + ql112.tinhTien(cmnd112));

        sc112.close();
    }

}
