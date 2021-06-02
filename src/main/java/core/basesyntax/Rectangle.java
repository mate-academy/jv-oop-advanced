package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, "
                + "area: " + area + " sq.unit, "
                + "sides: " + firstSide + " " + secondSide + " units, "
                + "color: " + color.name().toLowerCase();
    }
}
