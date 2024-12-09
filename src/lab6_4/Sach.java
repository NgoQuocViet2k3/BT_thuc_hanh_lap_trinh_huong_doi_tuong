package lab6_4;

public class Sach {
    private String tenSach,tacGia;
    private float gia;

    public Sach() {
    }

    public Sach(String tenSach, String tacGia, float gia) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", gia=" + gia +
                '}';
    }
}
