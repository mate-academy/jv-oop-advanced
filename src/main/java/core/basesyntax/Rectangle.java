package core.basesyntax;

public class Rectangle extends Figure {

    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void print() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq.units, first side "
                + firstSide
                + " units, last side: "
                + secondSide
                + " units, color: "
                + getColor()
        );
    }
}
