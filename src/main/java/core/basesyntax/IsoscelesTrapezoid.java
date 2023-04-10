package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public double getHeigth() {
        return height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2;
    }
    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid:");
        System.out.println("Height: " + height);
        System.out.println("First Base: " + firstBase);
        System.out.println("Second Base: " + secondBase);
        System.out.println("Area: " + getArea());
        System.out.println();
    }
}