package lab7_bai1;

public class SinhVien extends NguoiDung {
    private String maSV, nganhHoc;
    private int namHoc;

    public SinhVien() {

    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    public SinhVien(String ten, String diaChi, int namSinh, String maSV, String nganhHoc, int namHoc) {
        super(ten, diaChi, namSinh);
        this.maSV = maSV;
        this.nganhHoc = nganhHoc;
        this.namHoc = namHoc;

    }

    @Override
    public void hienThiTT() {
        super.hienThiTT();
        System.out.println(maSV + " " + nganhHoc + " " + namHoc);
    }

    @Override
    public void diemDanh() {
        System.out.println("Sinh vien " + getMaSV() + " " + getTen() +  " đã điểm danh");
    }

    @Override
    public void thongBao() {
        System.out.println("Sinh vien " + getTen() + " hay kiem tra diem so");
    }
}
