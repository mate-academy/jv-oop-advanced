package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    private String getFigureName() {
        String figureFullName = this.getClass().getName();
        int lastIdx = figureFullName.lastIndexOf('.');
        return figureFullName.substring(lastIdx + 1);
    }

    @Override
    public String draw() {
        return "Drowing a " + getFigureName();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureName() + ", area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg + ", secondLeg: "
                + secondLeg + " units, color: " + getColor();
    }
}
