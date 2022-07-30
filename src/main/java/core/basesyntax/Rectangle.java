package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, " + "square=" + getArea() + "sq.units, firstLeg=" + firstLeg
                + "units, secondLeg=" + secondLeg + "units, color=" + getColor() + '.';
    }
}
