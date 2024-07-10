package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double aBase;
    private double bBase;

    public IsoscelesTrapezoid(double height, double aBase, double bBase, String color) {
        this.height = height;
        this.aBase = aBase;
        this.bBase = bBase;
    }

    public double getbBase() {
        return bBase;
    }

    public void setbBase(double bBase) {
        this.bBase = bBase;
    }

    public double getaBase() {
        return aBase;
    }

    public void setaBase(double aBase) {
        this.aBase = aBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return ((aBase + bBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid," + "area: " + area() + "sq. units," + "a base: " + aBase + " units , b base: " + bBase + "units, height: "+ height + " units, color: " + color);
    }
}
