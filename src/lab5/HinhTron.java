package lab5;

public class HinhTron {
    private double banKinh;
    private String mau;

    public HinhTron(double banKinh, String mau) {
        this.banKinh = banKinh;
        this.mau = mau;
    }

    public HinhTron() {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                ", mau='" + mau + '\'' +
                '}';
    }
}
