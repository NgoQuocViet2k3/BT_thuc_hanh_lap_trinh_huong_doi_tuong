package lab8_bai3;

import java.util.Scanner;

public class Fish extends Animal{

    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    public void swim(){
        System.out.println(getName() + " dang boi");
    }
    public void dive(){
        System.out.println(getName() + " dang nhay khoi mat nuoc");
    }
    @Override
    protected void eat(Food food, int m) {
        food.setMass(food.getMass() - m);
    }

    @Override
    protected Animal haveBaby(String name) {
        return new Fish(name);
    }

    @Override
    public void scanInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        this.name = sc.nextLine();
    }
}
