package lab5;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CongNhan congNhan1 = new CongNhan();
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    CongNhan congNhan = new CongNhan();
                    break;
                case 2:
                    congNhan1 = new CongNhan();
                    congNhan1.scanInfo(congNhan1);
                    break;
                case 3:
                    System.out.println(congNhan1.printInfo());
                    break;
                case 4:
                    System.out.println(congNhan1.tinhLuong(congNhan1));
                    break;
                case 5:
                    System.out.println("Nhập lại hệ số lương: ");
                    congNhan1.setheSL(scanner.nextFloat());
                    System.out.println(congNhan1.printInfo());
                case 0:
                    System.out.println("Thoát chương trình.");
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }
        }while (choice != 0);

    }

    private static void menu() {
        System.out.println("Menu:");
        System.out.println("1: Tạo mới một object Cong nhan:");
        System.out.println("2: Cập nhật thuộc tính:");
        System.out.println("3: Hiển thị thông tin  :");
        System.out.println("4: Tính Lương:");
        System.out.println("5: Thay đổi thuộc tính hệ số lương của object vừa tạo và in ra thông tin object:");
        System.out.println("0: Thoát.");
        System.out.println("Nhập lựa chọn: ");
    }
}
