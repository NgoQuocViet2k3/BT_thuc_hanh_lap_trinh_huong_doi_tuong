package lab8_bai3;

import java.util.Scanner;

public class Tiger extends Animal{

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }

    public void run(int speed){
        System.out.println(getName() + " dang chay");
    }
    @Override
    protected void eat(Food food, int m) {
        food.setMass(food.getMass() - m);
    }

    @Override
    protected Animal haveBaby(String name) {
        return new Tiger(name);
    }

    @Override
    public void scanInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        this.name = sc.nextLine();
    }
}
