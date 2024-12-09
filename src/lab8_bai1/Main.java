package lab8_bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hinh> dsHinh = new ArrayList<>();
        HinhTron hinhTron = new HinhTron();
        System.out.println("Nhap ban kinh cua hinh tron: ");
        hinhTron.setR(sc.nextDouble());
        dsHinh.add(hinhTron);
        HinhTamGiac tamGiac = new HinhTamGiac();
        System.out.println("Nhap do dai canh a: ");
        tamGiac.setA(sc.nextDouble());
        System.out.println("Nhap do dai canh b: ");
        tamGiac.setB(sc.nextDouble());
        System.out.println("Nhap do dai canh c: ");
        tamGiac.setC(sc.nextDouble());
        if (tamGiac.kiemTraTamGiac()) {
            dsHinh.add(tamGiac);
        }else {
            System.out.println("Khong phai tam giac");
        }
        for(Hinh hinh : dsHinh){
            hinh.hienThi();
        }
    }
}
