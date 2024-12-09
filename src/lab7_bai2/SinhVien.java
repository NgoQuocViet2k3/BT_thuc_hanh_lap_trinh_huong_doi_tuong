package lab7_bai2;

public class SinhVien extends NguoiDung {
    private String maSV;

    public SinhVien() {
    }

    public SinhVien(String ten, String namSinh, String maSV) {
        super(ten, namSinh);
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public void hienThiTT() {
        System.out.println("Sinh vien co: Ho ten" + getTen() + ", nam sinh:  " + getNamSinh() + ", ma sinh vien: " + getNamSinh());
    }
}
