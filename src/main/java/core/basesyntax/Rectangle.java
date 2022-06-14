package core.basesyntax;

public class Rectangle extends Figure{
    private final int firstSide;
    private final int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        super.setColor();
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, " +
                "area: " + getArea() +" sq.units, "+
                "firstSide: " + firstSide + " units, " +
                "secondSide: " + secondSide + " units, " +
                "color: " + super.getColor().toLowerCase();
    }
}
