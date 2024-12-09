package lab8_bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        Food food = new Food();
        System.out.println("Nhap khoi luong thuc an: ");
        food.setMass(scanner.nextInt());
        Fish fish = new Fish();
        fish.scanInfo();
        fish.dive();
        fish.swim();
        fish.eat(food,1);
        Bird bird = new Bird();
        bird.scanInfo();
        bird.fly();
        bird.haveBaby("chim go kien");
        bird.eat(food,2);
        Tiger tiger = new Tiger();
        tiger.run(45);
        tiger.haveBaby("ho con");
    }
}
