package lab7_bai1;

public class NguoiDung {
    private String ten, diaChi;
    private int namSinh;

    public NguoiDung() {
    }

    public NguoiDung(String ten, String diaChi, int namSinh) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void hienThiTT(){
        System.out.println("Thong tin nguoi dung:");
        System.out.println(ten + " " + namSinh + " " + diaChi);
    }
    public void diemDanh(){
    }
    public void thongBao(){
    }
}
