package lab6_2;

public class Cat {
    private String name;
    private int speed;

    public Cat() {
    }

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void eat(Rat food) {
        if (catchs(food)) {
            if (food.getWeight() >= 100) {
                System.out.println("Mum Mum! Chuot beo day!");
            } else {
                System.out.println("Mum Mum! Chuot hoi gay!");
            }
        }else {
            System.out.println("Meo khong bat duoc chuot.");
        }
    }
    public void run(){
        System.out.println("Meo dang chay");
    }
    public boolean catchs(Rat a){
       return this.getSpeed() >= a.getSpeed();
    }
}
