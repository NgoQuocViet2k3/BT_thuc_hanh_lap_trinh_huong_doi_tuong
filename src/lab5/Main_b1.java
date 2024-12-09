package lab5;

import java.util.Scanner;

public class Main_b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Nhap ban kinh cua hinh tron: ");
        double banKinh = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap mau cua hinh tron: ");
        String mau = scanner.nextLine();
        HinhTron hinhTron = new HinhTron();
        hinhTron.setBanKinh(banKinh);
        hinhTron.setMau(mau);
        System.out.println("Hinh tron co ban kinh: " + hinhTron.getBanKinh() + " ,mau " + hinhTron.getMau());
        HinhTron hinhTron1 = new HinhTron(4,"Green");
        System.out.println("Hinh tron co ban kinh: " + hinhTron1.getBanKinh() + " ,mau " + hinhTron1.getMau());
        */
        CongNhan congNhan = new CongNhan();
        congNhan.scanInfo(congNhan);
        System.out.println(congNhan.printInfo());
        System.out.println("Luong cua cong nhan la: " + congNhan.tinhLuong(congNhan));
        CongNhan congNhan1 = new CongNhan("080","Viet",3.4f);
        System.out.println("Nhap ma so cong nhan: ");
        congNhan.setMaSo(scanner.nextLine());
        System.out.println("Nhap ho ten cong nhan: ");
        congNhan1.setHoTen(scanner.nextLine());
        System.out.println("Nhap he so luong: ");
        congNhan1.setheSL(scanner.nextFloat());
        System.out.println("Ma so cong nhan la: " + congNhan1.getMaSo() + ", Ten cong nhan: " + congNhan1.getHoTen() +
                ", He so luong: " + congNhan1.getheSL());

    }
}
