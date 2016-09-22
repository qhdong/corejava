package v1ch06.interfaces;

public class Car implements Powered {
    private double x;
    private double y;

    @Override
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double milesPerGallon() {
        return Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.move(100, 44);
        System.out.println(car.milesPerGallon());
        System.out.println(car.isOverSpeed());
    }


}
