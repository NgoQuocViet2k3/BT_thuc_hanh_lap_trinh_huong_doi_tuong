package lab8_bai2;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private float hourlyRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, int id, int hoursWorked, float hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float calculateSalary() {
        return hourlyRate * hourlyRate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Luong cua nhan vien " + getName() + ", co ma so nhan vien " + getId() + " la: " + calculateSalary());
    }
}
