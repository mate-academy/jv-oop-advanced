package core.basesyntax;

public class Rectangle extends Figure {
    private double sideLength1;
    private double sideLength2;

    public Rectangle(String color, double sideLength1, double sideLength2) {
        super(color);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    public double getSideLength1() {
        return sideLength1;
    }

    public void setSideLength1(double sideLength1) {
        this.sideLength1 = sideLength1;
    }

    public double getSideLength2() {
        return sideLength2;
    }

    public void setSideLength2(double sideLength2) {
        this.sideLength2 = sideLength2;
    }

    @Override
    public double getArea() {
        return sideLength1 * sideLength2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, sideLength1: "
                + getSideLength1() + " units, sideLength2: "
                + getSideLength2() + " units, color: "
                + getColor());
    }
}
