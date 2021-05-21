package core.basesyntax;

public class RightTriangle extends Figure implements FigureArea {

    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String name, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        this.name = name;
    }

    public double getArea() {
        return area = (firstLeg * secondLeg) / 2;
    }

    public void printDraw() {
        System.out.println("Figure: " + name
                + ", area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units "
                + "color: " + color);
    }
}