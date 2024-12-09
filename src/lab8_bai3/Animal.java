package lab8_bai3;

import java.util.Scanner;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void eat(Food food, int m){
        food.setMass(food.getMass() -m);
    }
    protected abstract Animal haveBaby(String name);
    public  void scanInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        this.name = sc.nextLine();
    }
}
