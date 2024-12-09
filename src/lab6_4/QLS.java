package lab6_4;


import java.util.ArrayList;
import java.util.Scanner;

public class QLS {
    ArrayList<Sach> dss = new ArrayList<>();

    public void themSach() {
        Scanner sc = new Scanner(System.in);
        String input;
        int i = 0;
        System.out.println("Nhap du lieu den khi gap ky tu k");
        while (true) {
            input = sc.nextLine();
            if (input.equalsIgnoreCase("k")) {
                break;
            }
            System.out.println("Nhap quyen sach thu " + (i + 1));
            System.out.println("Nhap ten sach: ");
            String tenSach = sc.nextLine();
            System.out.println("Nhap ten tac gia: ");
            String tacGia = sc.nextLine();
            System.out.println("Nhap gia sach: ");
            float gia = sc.nextFloat();
            sc.nextLine();
            dss.add(new Sach(tenSach, tacGia, gia));
            i++;
        }
    }

    @Override
    public String toString() {
        return "QLSV{" +
                "dss=" + dss +
                '}';
    }

    public void xoaSachTheoTen(String ten) {
        boolean xoa = false;
        for (int i = 0; i < dss.size(); i++) {
            if (dss.get(i).getTenSach().equalsIgnoreCase(ten)) {
                dss.remove(i);
                xoa = true;
                System.out.println("Sach da bi xoa");
                i--;
            }
        }
        if (!xoa)
            System.out.println("Khong tim thay ten sach can xoa");
    }

    public void timKiemSachTheoTen(String ten) {
        ArrayList<Sach> ketQua = new ArrayList<>();
        for (Sach sach : dss) {
            if (sach.getTenSach().equalsIgnoreCase(ten)) {
                ketQua.add(sach);
            }
        }
        if (ketQua.isEmpty()) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Tim thay " + ketQua.size() + " quyen sach trong danh sach.");
            for (Sach sach : ketQua) {
                System.out.println(sach);
            }
        }
    }
}
