package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String getDrawing() {
        return "Figure : " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + String.format("%.2f", getArea())
                + " sq.units, first leg: " + firstLeg + " second leg: "
                + secondLeg + " units, color: " + getColor();
    }
}
