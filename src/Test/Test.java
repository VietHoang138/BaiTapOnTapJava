package Test;
import java.util.Scanner;
import Class.QuanLy;

public class Test {

    public static void main(String[] args) {
        Scanner sc112 = new Scanner(System.in);
        QuanLy ql112 = new QuanLy();
        ql112.nhapDanhSach(sc112);
        System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
        ql112.timKiem(8000000);
        sc112.close();
    }
}
