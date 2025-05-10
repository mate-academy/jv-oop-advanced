package model;

public class Trapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public Trapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Trapezoid area: " + getArea() + ", color: " + getColor());
    }
}
