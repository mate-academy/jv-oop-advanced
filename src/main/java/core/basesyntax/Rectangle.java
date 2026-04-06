package core.basesyntax;

public class Rectangle extends Figure {

    private int sideA;
    private int sideB;

    Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + ", side A: " + sideA
                + ", side B: " + sideB
                + ", color: " + getColor();
    }
}
