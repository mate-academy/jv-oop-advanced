package core.basesyntax;

public class Rectangle extends Figure {
    private final int fistSide;
    private final int secondSide;

    public Rectangle(Color color, int fistSide, int secondSide) {
        super(color);
        this.fistSide = fistSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return fistSide * secondSide;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, fistSide: "
                + fistSide + " sq.units, secondSide: "
                + secondSide + " units color " + getColor());
    }
}
