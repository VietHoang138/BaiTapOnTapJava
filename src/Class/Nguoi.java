package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen112;
    private Date ngaySinh112;
    private String ngheNghiep112;

    public Nguoi() {

    }

    public Nguoi(String hoTen112, Date ngaySinh112, String ngheNghiep112) {
        this.hoTen112 = hoTen112;
        this.ngaySinh112 = ngaySinh112;
        this.ngheNghiep112 = ngheNghiep112;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen112 = sc.nextLine();
        System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
        String strDate112 = sc.nextLine();
        ngaySinh112 = strToDate(strDate112);
        System.out.print("\tNhap nghe nghiep: ");
        ngheNghiep112 = sc.nextLine();
    }

    private Date strToDate(String strDate112) {
        Date date112 = null;

        SimpleDateFormat sdf112 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date112 = sdf112.parse(strDate112);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date112;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen112);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh112));
        System.out.println("\tNghe nghiep: " + ngheNghiep112);
    }

    private String dateToString(Date date112) {
        SimpleDateFormat sdf112 = new SimpleDateFormat("dd-MM-yyyy");

        String strDate112 = sdf112.format(date112);

        return strDate112;
    }

    public Date getNgaySinh() {
        return ngaySinh112;
    }
}
