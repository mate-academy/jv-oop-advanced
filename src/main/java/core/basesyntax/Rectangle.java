package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return ("Figure: rectangle, area: " + getArea() + " sg.units, first side: " + firstSide
                + " units, second side: " + secondSide + " units, color: " + getColor());
    }
}
