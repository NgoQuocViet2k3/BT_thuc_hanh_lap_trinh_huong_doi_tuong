package lab6_4;

import java.util.Scanner;

public class Main_QLS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten;
        QLS qls = new QLS();
        qls.themSach();
        System.out.println("Danh sach vua them: " + qls.toString());
        System.out.println("Nhap ten sach can xoa: ");
        ten = sc.nextLine();
        qls.xoaSachTheoTen(ten);
        System.out.println("Nhap ten sach can tim: ");
        ten = sc.nextLine();
        qls.timKiemSachTheoTen(ten);
    }
}