package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return this.firstLeg * this.secondLeg / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase() + ", area: "
                + calculateArea() + " sq.units, first leg: " + this.firstLeg
                + " units, second leg: " + this.secondLeg + " units, color: "
                + this.getColor());
    }
}
