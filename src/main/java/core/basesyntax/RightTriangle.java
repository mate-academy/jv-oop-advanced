package core.basesyntax;

public class RightTriangle extends Shape {
    private double side;
    private double base;

    public RightTriangle(String color, double side, double base) {
        super(Colors.valueOf(color));
        this.side = Math.round(Math.abs(side));
        this.base = Math.round(Math.abs(base));
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (side * base) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Shape: right triangle, area: " + calculateArea()
                + ", side: " + getSide()
                + ", base: " + getBase()
                + ", color: " + getColor());
    }
}
