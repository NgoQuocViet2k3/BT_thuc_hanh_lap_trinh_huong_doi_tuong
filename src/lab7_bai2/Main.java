package lab7_bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhoaHoc> danhSachKhoaHoc = new ArrayList<>();
        SinhVien sinhVien = new SinhVien();
        while (true) {
            System.out.println("Nhập tên khóa học (Nhập 'exit' để kết thúc): ");
            String tenKhoaHoc = sc.nextLine();
            if (tenKhoaHoc.equalsIgnoreCase("exit")) {
                break;
            }
            KhoaHoc khoaHoc = new KhoaHoc(tenKhoaHoc);
            khoaHoc.themSinhVien(sinhVien);
            danhSachKhoaHoc.add(khoaHoc);
            for(KhoaHoc khoaHoc1: danhSachKhoaHoc){
                khoaHoc1.inTTSinhVien();
            }
        }
    }
}