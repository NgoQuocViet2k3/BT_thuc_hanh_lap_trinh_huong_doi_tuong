package lab6_3;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    ArrayList<SinhVien> dssv = new ArrayList<>();
    public void themSinhVien(){
        Scanner sc = new Scanner(System.in);
        String input;
        int i = 0;
        System.out.println("Nhap du lieu den khi gap ky tu k");
        while(true){
            input = sc.nextLine();
            if(input.equalsIgnoreCase("k")){
                break;
            }
            System.out.println("Nhap sinh vien thu " + (i + 1));
            System.out.println("Nhap ten: ");
            String ten = sc.nextLine();
            System.out.println("Nhap tuoi: ");
            int tuoi = sc.nextInt();
            System.out.println("Nhap diem: ");
            float diem = sc.nextFloat();
            sc.nextLine();
            dssv.add(new SinhVien(ten,tuoi,diem));
            i++;
        }
    }

    @Override
    public String toString() {
        return "QLSV{" +
                "dssv=" + dssv +
                '}';
    }
    public void xoaSinhVienTheoTen(String ten){
        boolean xoa = false;
        for (int i = 0; i < dssv.size(); i++){
            if (dssv.get(i).getTen().equalsIgnoreCase(ten)){
                dssv.remove(i);
                xoa = true;
                System.out.println("Sinh vien da bi xoa");
                i--;
            }
        }
        if (!xoa)
            System.out.println("Khong tim thay ten can xoa");
    }
    public void timKiemTheoTen(String ten){
        ArrayList<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sv: dssv){
            if (sv.getTen().equalsIgnoreCase(ten)){
                ketQua.add(sv);
            }
        }
        if (ketQua.isEmpty()){
            System.out.println("Khong tim thay");
        }else {
            System.out.println("Tim thay " + ketQua.size() + " sv trong danh sach.");
            for (SinhVien sv: ketQua){
                System.out.println(sv);
            }
        }
    }
}
