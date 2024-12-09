package lab6_3;

import java.util.Scanner;

public class Main_QLSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten;
        QLSV qlsv = new QLSV();
        qlsv.themSinhVien();
        System.out.println("Danh sach vua them: " + qlsv.toString());
        System.out.println("Nhap ten sinh vien can xoa: ");
        ten = sc.nextLine();
        qlsv.xoaSinhVienTheoTen(ten);
        System.out.println("Nhap ten sinh vien can tim: ");
        ten = sc.nextLine();
        qlsv.timKiemTheoTen(ten);
    }
}
