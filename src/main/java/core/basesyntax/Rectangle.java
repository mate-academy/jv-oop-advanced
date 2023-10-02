package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, "
                + "area: " + getArea() + " sq.units, "
                + "firstSide: " + firstSide + " units, "
                + "secondSide: " + secondSide + " units, "
                + "color: " + super.getColor().toLowerCase();
    }
}
