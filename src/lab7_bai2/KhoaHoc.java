package lab7_bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoaHoc {
    private String tenKH;
    private ArrayList<SinhVien> dssv;

    public KhoaHoc() {
    }

    public KhoaHoc(String tenKH) {
        this.tenKH = tenKH;
        this.dssv = new ArrayList<>();
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public void themSinhVien(SinhVien sv) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập mã sinh viên (Nhập 'exit' để kết thúc): ");
            String maSV = sc.nextLine();
            if (maSV.equalsIgnoreCase("exit")) {
                break;
            }
            sv.setMaSV(maSV);
            System.out.println("Nhập họ tên: ");
            sv.setTen(sc.nextLine());
            System.out.println("Nhập nam sinh: ");
            sv.setNamSinh(sc.nextLine());
            dssv.add(sv);
        }
    }
    public void inTTSinhVien(){
        System.out.println("Khóa học: " + getTenKH());
        for (SinhVien sv : dssv) {
            sv.hienThiTT(); }
    }
}