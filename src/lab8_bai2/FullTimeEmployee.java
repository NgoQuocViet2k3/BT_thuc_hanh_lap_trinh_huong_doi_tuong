package lab8_bai2;

public class FullTimeEmployee extends Employee {
    private float basicSalary;
    private float bonus;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int id, float basicSalary, float bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Luong cua nhan vien " + getName() + ", co ma nhan vien " + getId() + " la: " + calculateSalary());
    }
}
