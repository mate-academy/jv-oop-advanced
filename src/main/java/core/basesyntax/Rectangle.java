package core.basesyntax;

public class Rectangle extends Figure implements FigureArea {
    private final int sideA;
    private final int sideB;

    public Rectangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getAreaFigures() {
        return getArea(sideA * sideB);
    }

    public void printDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "sideA: " + sideA + " units, "
                + "sideB: " + sideB + " units "
                + "color: " + getColor());
    }
}
