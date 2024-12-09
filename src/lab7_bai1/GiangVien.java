package lab7_bai1;

public class GiangVien extends NguoiDung{
    private String maGV,boMon,khoa;

    public GiangVien() {
    }

    public GiangVien(String ten, String diaChi, int namSinh, String maGV, String boMon, String khoa) {
        super(ten, diaChi, namSinh);
        this.maGV = maGV;
        this.boMon = boMon;
        this.khoa = khoa;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT();
        System.out.println(maGV + " " + boMon + " " + khoa);
    }

    @Override
    public void diemDanh() {
        System.out.println("Giang vien " + getMaGV() + " " + getTen() + " da diem danh");
    }

    @Override
    public void thongBao() {
        System.out.println("Giang vien " + getTen() +  " hay cap nhat bai giang moi");
    }
}
