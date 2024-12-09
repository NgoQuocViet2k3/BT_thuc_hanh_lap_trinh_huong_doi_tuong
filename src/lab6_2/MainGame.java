package lab6_2;

import lab6.Bird;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat();
        Rat rat = new Rat();
        System.out.println("Nhap ten meo: ");
        cat.setName(scanner.nextLine());
        System.out.println("Nhap toc do cua meo: ");
        cat.setSpeed(scanner.nextInt());
        System.out.println("Nhap ten chuot: ");
        rat.setName(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Nhap toc do cua chuot: ");
        rat.setSpeed(scanner.nextInt());
        System.out.println("Nhap can nang cua chuot: ");
        rat.setWeight(scanner.nextInt());
        cat.eat(rat);
    }
}
