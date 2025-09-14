package Class;

import java.util.Scanner;

public class PhanSo {
    private int tuSo112;
    private int mauSo112;

    public PhanSo() {
        this.tuSo112 = 0;
        this.mauSo112 = 1;
    }

    public PhanSo(int tuSo112, int mauSo112) {
        this.tuSo112 = tuSo112;
        this.mauSo112 = mauSo112;
    }

    public void nhapPS(Scanner sc) {
        int a;
        int b;
        do{
            System.out.print("Nhap tu so: ");
            a = sc.nextInt();
            System.out.print("Nhap mau so: ");
            b = sc.nextInt();
            if(b==0){
                System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
            }
            else{
                tuSo112 = a;
                mauSo112 = b;
            }
        }
        while (b==0);
    }

    public void hienThiPS() {
        if(tuSo112 * mauSo112 < 0){
            System.out.println("-"+Math.abs(tuSo112)+ "/" + Math.abs(mauSo112));
        }
        else{
            System.out.println(+Math.abs(tuSo112)+ "/" + Math.abs(mauSo112));
        }
    }
 //ham cong
    public PhanSo congPS(PhanSo ps2) {
        int a = tuSo112 * ps2.mauSo112 + ps2.tuSo112 * mauSo112;
        int b = mauSo112 * ps2.mauSo112;

        return new PhanSo(a, b);
    }

    //ham tru
    public PhanSo truPS(PhanSo ps2) {
        int a = tuSo112 * ps2.mauSo112 - ps2.tuSo112 * mauSo112;
        int b = mauSo112 * ps2.mauSo112;

        return new PhanSo(a, b);
    }

    //ham nhan
    public PhanSo nhanPS(PhanSo ps2) {
        int a = tuSo112 * ps2.tuSo112;
        int b = mauSo112 * ps2.mauSo112;

        return new PhanSo(a, b);
    }

    //ham chia
    public PhanSo chiaPS(PhanSo ps2) {
        int a = tuSo112 * ps2.mauSo112;
        int b = mauSo112 * ps2.tuSo112;

        return new PhanSo(a, b);
    }

    //ham tim uscln
    private int timUSCLN(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    //ham kiem tra phan so toi gian hay chua
    public boolean kiemTraToiGian(){
        if(timUSCLN(tuSo112,mauSo112)==1){
            return true;
        }
        return false;
    }

    //ham toi gian
    public void toiGianPS(){
        int x = timUSCLN(tuSo112,mauSo112);

        tuSo112 /= x;
        mauSo112 /= x;

    }

}



