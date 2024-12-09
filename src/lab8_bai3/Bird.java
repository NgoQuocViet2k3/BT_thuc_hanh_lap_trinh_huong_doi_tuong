package lab8_bai3;

import java.util.Scanner;

public class Bird extends Animal {

    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(getName() + " dang bay");
    }

    @Override
    protected void eat(Food food, int m) {
         food.setMass(food.getMass() - m);
    }

    @Override
    protected Animal haveBaby(String name) {
        return new Bird(name);
    }


    @Override
    public void scanInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        this.name = sc.nextLine();
    }
}

