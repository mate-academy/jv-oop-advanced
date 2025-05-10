package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public double getBase() {
        return Math. sqrt((firstLeg * firstLeg) + (secondLeg * secondLeg));
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle" + ", area: "
                + getArea() + " sq.units" + ", base: "
                + getBase() + " units" + ", firstLeg: " + getFirstLeg()
                + " units" + ", secondLeg: " + getSecondLeg()
                + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColor());
    }

    @Override
    public double getPerimeter() {
        return getBase() + firstLeg + secondLeg;
    }
}
