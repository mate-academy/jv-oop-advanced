package state;

public class Rectangle implements Shape{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {

    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
