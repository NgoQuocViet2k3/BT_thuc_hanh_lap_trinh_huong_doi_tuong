package lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Chim chao mao", "Xanh", 10f);
        Cat cat = new Cat("Meo Anh long ngan", 5f, 30f);
        bird.fly();
        cat.run();
        if (cat.catchs(bird)) {
            System.out.println("Chim da bi meo bat mat");
        } else {
            System.out.println("Meo khong bat duoc chim");
        }
    }
}
