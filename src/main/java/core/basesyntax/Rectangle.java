package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle() {
        this.firstSide = random.nextInt(MAX_NUMBER);
        this.secondSide = random.nextInt(MAX_NUMBER);
        area = getArea();
    }

    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: "
                + String.format("%.2f", area) + " sq.units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, color: "
                + color;
    }
}
