package core.basesyntax;

public class RightTriangle extends Figure {

    private double side;
    private double base;
    private String color;

    public RightTriangle(double side, double base, String color) {
        this.side = side;
        this.base = base;
        this.color = color;
    }

    public double uniqueMethod() {
        return Math.round(Math.hypot(base, side));
    }

    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ", area : " + getArea()
                + " sq. units, " + "Its' hypotenuse is " + uniqueMethod()
                + " units , color: " + this.color.toLowerCase());
    }

    @Override
    public double getArea() {
        return (side + base) / 2;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
