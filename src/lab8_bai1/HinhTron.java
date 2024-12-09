package lab8_bai1;

public class HinhTron extends Hinh {
    private double r;

    public HinhTron(double r) {
        this.r = r;
    }

    public HinhTron() {
    }

    @Override
    public double tinhChuVi() {
        return 2 * r * Math.PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return 2*r*r*Math.PI;
    }

    @Override
    public void hienThi() {
        System.out.println("Hinh tron co ban kinh: " + r);
        System.out.println("Chu vi cua hinh tron la: " + tinhChuVi());
        System.out.println("Dien tich cua hinh tron la: " + tinhDienTich());
    }
}
