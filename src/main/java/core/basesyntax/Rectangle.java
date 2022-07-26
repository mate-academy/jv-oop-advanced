package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
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
        return "Figure: Rectangle, area: " + getArea() + " sq. units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide + " units, color: "
                + getColor();
    }

    @Override
    public String toString() {
        return draw();
    }
}

