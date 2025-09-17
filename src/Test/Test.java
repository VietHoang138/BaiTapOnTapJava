package Test;
import java.util.Scanner;
import Class.HSHocSinh;

public class Test {

    public static void main(String[] args) {
        Scanner sc112=new Scanner(System.in);
        HSHocSinh list112=new HSHocSinh();
        list112.nhapDanhSachHS(sc112);

        System.out.println("2. Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
        list112.timKiemThongTin(1985, "Thai Nguyen");

        System.out.println("3. Nhung hoc sinh hoc lop 10A1 la:");
        list112.timKiemThongTin("10A1");

        sc112.close();
    }

}
