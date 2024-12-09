package lab5;

import java.util.Scanner;

public class CongNhan {
    private String maSo;
    private String hoTen;
    private float heSL;
    private float luongCB;
    private int soNgayCong;

    public CongNhan() {
    }

    public CongNhan(String maSo, String hoTen, float heSL) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.heSL = heSL;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getheSL() {
        return heSL;
    }

    public void setheSL(float heSL) {
        this.heSL = heSL;
    }
    public void scanInfo(CongNhan congNhan){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma so cong nhan: ");
        congNhan.setMaSo(scanner.nextLine());
        System.out.println("Nhap ho ten cong nhan: ");
        congNhan.setHoTen(scanner.nextLine());
        System.out.println("Nhap he so luong: ");
        congNhan.setheSL(scanner.nextFloat());
        System.out.println("Nhap luong co ban: ");
        congNhan.setLuongCB(scanner.nextFloat());
        System.out.println("Nhap so ngay cong: ");
        congNhan.setSoNgayCong(scanner.nextInt());
    }
    public String printInfo() {return "CongNhan{" +
            "maSo='" + maSo + '\'' +
            ", hoTen='" + hoTen + '\'' +
            ", heSL=" + heSL +
            ", luongCB=" + luongCB +
            ", soNgayCong=" + soNgayCong +
            '}';
    }


    public float getHeSL() {
        return heSL;
    }

    public void setHeSL(float heSL) {
        this.heSL = heSL;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    public float tinhLuong(CongNhan congNhan){
        float luongCB = congNhan.getLuongCB();
        float heSL = congNhan.getHeSL();
        int soNgayCong = congNhan.getSoNgayCong();
        float luong = luongCB * heSL * soNgayCong;
        return luong;
    }
}
