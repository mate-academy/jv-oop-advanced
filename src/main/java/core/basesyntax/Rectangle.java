package core.basesyntax;

public class Rectangle extends Figure implements FigureArea {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB, String name, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.name = name;
    }

    public double getArea() {
        return area = sideA * sideB;
    }

    public void printDraw() {
        System.out.println("Figure: " + name
                + ", area: " + getArea() + " sq.units, "
                + "sideA: " + sideA + " units, "
                + "sideB: " + sideB + " units "
                + "color: " + color);
    }
}