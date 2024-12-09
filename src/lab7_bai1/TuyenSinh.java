package lab7_bai1;

public class TuyenSinh {
    private SinhVien sv;
    private KhoaHoc kh;
    private float diem;

    public TuyenSinh() {
    }

    public TuyenSinh(SinhVien sv, KhoaHoc kh, float diem) {
        this.sv = sv;
        this.kh = kh;
        this.diem = diem;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public KhoaHoc getKh() {
        return kh;
    }

    public void setKh(KhoaHoc kh) {
        this.kh = kh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    public void dangKy(SinhVien sv, KhoaHoc kh){
        System.out.println(sv.getMaSV() + " " + sv.getNganhHoc() + " " + sv.getNamHoc());
        System.out.println("Sinh vien da dang ky khoa hoc.");
        System.out.println(kh.getMaKH() + " " + kh.getTenKH() + " " + kh.getSoTinChi());
    }
}
