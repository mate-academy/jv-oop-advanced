package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, color:"
                + getColor());
    }

    @Override
    public double getArea() {
        return (double) firstSide * secondSide;
    }
}

