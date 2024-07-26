package Figures;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid - Color: " + getColor()
                + ", Base 1: " + firstBase + ", Base 2: " + secondBase
                + ", Height: " + height + ", Area: " + calculateArea());
    }
}
