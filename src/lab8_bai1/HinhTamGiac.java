package lab8_bai1;

public class HinhTamGiac extends Hinh {
    private double a, b, c;

    public HinhTamGiac() {
    }

    public HinhTamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean kiemTraTamGiac() {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }

    @Override
    public double tinhDienTich() {
        double p = (a + b + c) /2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void hienThi() {
        System.out.println("Do dai tam giac a, b, c lan luot la: " + a + ", " + b + ", " + c);
        System.out.println("Chu vi cua tam giac la: " + tinhChuVi());
        System.out.println("Dien tich cua tam giac la: " + tinhDienTich());
    }
}
