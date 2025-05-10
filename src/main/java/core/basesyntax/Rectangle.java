package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
