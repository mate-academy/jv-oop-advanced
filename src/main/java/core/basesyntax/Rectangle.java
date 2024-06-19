package core.basesyntax;

public class Rectangle extends Figure {

    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getArea() {
        return firstSide * secondSide;
    }

    public String draw() {
        return "Figure: square, Area: "
                + getArea()
                + " units, First side: "
                + firstSide
                + " units, Second side: "
                + secondSide
                + " units, "
                + " Figure Color "
                + getColor();
    }
}
