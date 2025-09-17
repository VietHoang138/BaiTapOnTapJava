package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen112;
    protected Date ngaySinh112;
    protected String queQuan112;

    public Nguoi() {}

    public Nguoi(String hoTen112, Date ngaySinh112, String queQuan112) {
        this.hoTen112 = hoTen112;
        this.ngaySinh112 = ngaySinh112;
        this.queQuan112 = queQuan112;
    }

    public void nhapThongTin(Scanner sc112) {
        System.out.print("\tNhap ho ten: ");
        hoTen112 = sc112.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        String strDate112 = sc112.nextLine();
        ngaySinh112 = strToDate(strDate112);

        System.out.print("\tNhap que quan: ");
        queQuan112 = sc112.nextLine();
    }

    private Date strToDate(String strDate) {
        Date date112 = null;
        SimpleDateFormat sdf112 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date112 = sdf112.parse(strDate);
        } catch (ParseException e112) {
            System.out.println("Loi dinh dang ngay thang!");
        }
        return date112;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen112);
        System.out.println("\tNgay sinh: " + ngaySinh112);
        System.out.println("\tQue quan: " + queQuan112);
    }

    public String getQueQuan() {
        return queQuan112;
    }

    public Date getNgaySinh() {
        return ngaySinh112;
    }
}
