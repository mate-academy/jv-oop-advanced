package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid() {
        this.firstSide = random.nextInt(MAX_NUMBER);
        this.secondSide = random.nextInt(MAX_NUMBER);
        this.height = random.nextInt(MAX_NUMBER);
        area = getArea();
    }

    public double getArea() {
        return (firstSide + secondSide) * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: "
                + String.format("%.2f", area) + " sq.units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, height: "
                + height + " units, color: "
                + color;
    }
}
