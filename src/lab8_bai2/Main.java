package lab8_bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        System.out.println("Nhap ma nhan vien");
        fullTimeEmployee.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten nhan vien");
        fullTimeEmployee.setName(sc.nextLine());
        System.out.println("Nhap luong co ban cua nhan vien toan thoi gian: ");
        fullTimeEmployee.setBasicSalary(sc.nextFloat());
        System.out.println("Nhap thuong cua nhan vien toan thoi gian: ");
        fullTimeEmployee.setBonus(sc.nextFloat());
        employeeArrayList.add(fullTimeEmployee);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        System.out.println("Nhap ma nhan vien");
        partTimeEmployee.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten nhan vien");
        partTimeEmployee.setName(sc.nextLine());
        System.out.println("Nhap luong theo gio cua nhan vien ban thoi gian: ");
        partTimeEmployee.setHourlyRate(sc.nextFloat());
        System.out.println("Nhap so gio lam cua nhan vien ban thoi gian: ");
        partTimeEmployee.setHoursWorked(sc.nextInt());
        employeeArrayList.add(partTimeEmployee);
        for (Employee employee : employeeArrayList){
            employee.displayInfo();
        }
    }
}
