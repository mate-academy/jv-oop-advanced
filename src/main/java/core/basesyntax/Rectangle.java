package core.basesyntax;

public class Rectangle extends Figure {
    private final int smallerSide;
    private final int biggerSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.biggerSide = Math.max(firstSide, secondSide);
        this.smallerSide = Math.min(firstSide, secondSide);
    }

    @Override
    public String draw() {
        return "Figure: rectangle, "
                + "area: " + getArea() + " sq. units"
                + ", smaller side: " + smallerSide + " units"
                + ", bigger side: " + biggerSide + " units"
                + ", color: " + color;
    }

    @Override
    public double getArea() {
        return (double) smallerSide * biggerSide;
    }
}
