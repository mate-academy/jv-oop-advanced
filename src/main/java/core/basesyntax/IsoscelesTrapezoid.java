package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double firstBase;
    private double secondBase;
    private double height;
    private double side;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(String color, double firstBase,
                              double secondBase, double height, double side) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.side = side;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public double getHeight() {
        return height;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid" + ", area: "
                + getArea() + " sq.units" + ", firstBase: "
                + getFirstBase() + " units" + ", secondBase: " + getSecondBase()
                + " units" + ", side: " + getSide() + " units" + ", height: "
                + getHeight() + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public double getPerimeter() {
        return firstBase + secondBase + side * 2;
    }
}
