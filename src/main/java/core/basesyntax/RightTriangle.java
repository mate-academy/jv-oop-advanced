package core.basesyntax;

public class RightTriangle extends Figure implements FigureArea {

    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String name, String color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getAreaFigures() {
        return getArea((firstLeg * secondLeg) / 2);
    }

    public void printDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units "
                + "color: " + getColor());
    }
}
