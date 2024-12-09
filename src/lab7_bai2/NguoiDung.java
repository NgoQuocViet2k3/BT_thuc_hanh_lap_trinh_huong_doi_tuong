package lab7_bai2;

public abstract class NguoiDung {
    private String ten,namSinh;
    public abstract void hienThiTT();

    public NguoiDung() {
    }

    public NguoiDung(String ten, String namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
}
