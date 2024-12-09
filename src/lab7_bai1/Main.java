package lab7_bai1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NguoiDung nd = new NguoiDung();
        SinhVien sv = new SinhVien();
        NguoiDung nd1 = new SinhVien();
        GiangVien gv = new GiangVien();
        KhoaHoc kh = new KhoaHoc();
        TuyenSinh tuyenSinh = new TuyenSinh();
        System.out.println("Nhap thong tin sinh vien: ");
        System.out.println("Nhap ma sinh vien: ");
        sv.setMaSV(sc.nextLine());
        System.out.println("Nhap nganh hoc: ");
        sv.setNganhHoc(sc.nextLine());
        System.out.println("Nhap nam hoc: ");
        sv.setNamHoc(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ma khoa hoc: ");
        kh.setMaKH(sc.nextLine());
        System.out.println("Nhap ten khoa hoc: ");
        kh.setTenKH(sc.nextLine());
        System.out.println("Nhap so tin chi: ");
        kh.setSoTinChi(sc.nextInt());
        tuyenSinh.dangKy(sv,kh);

        System.out.println("Nhap ma sinh vien can diem danh");
        sc.nextLine();
        sv.setMaSV(sc.nextLine());
        sv.diemDanh();
        sv.thongBao();
        System.out.println("Nhap ma giang vien can diem danh");
        gv.setMaGV(sc.nextLine());
        gv.diemDanh();
        gv.thongBao();
    }
}
