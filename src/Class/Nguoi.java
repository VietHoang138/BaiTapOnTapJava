package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen112;
    protected Date ngaySinh112;
    protected int CMND112;

    public Nguoi() {

    }

    public Nguoi(String hoTen112, Date ngaySinh112, int CMND112) {
        this.hoTen112 = hoTen112;
        this.ngaySinh112 = ngaySinh112;
        this.CMND112 = CMND112;
    }

    public void nhapThongTin(Scanner sc112) {
        System.out.print("\tNhap ho ten: ");
        hoTen112 = sc112.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        String strDate112 = sc112.nextLine();
        ngaySinh112 = strToDate(strDate112);
        System.out.print("\tNhap CMND: ");
        CMND112 = sc112.nextInt();
    }

    private Date strToDate(String strDate112) {
        Date date112 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date112 = sdf.parse(strDate112);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date112;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen112);
        SimpleDateFormat sdf112 = new SimpleDateFormat("dd-MM-yyyy");
        String ngaySinhStr112 = ngaySinh112 != null ? sdf112.format(ngaySinh112) : "";
        System.out.println("\tNgay sinh: " + ngaySinhStr112);
        System.out.println("\tCMND: " + CMND112);
    }

    public int getCMND() {
        return CMND112;
    }
}
