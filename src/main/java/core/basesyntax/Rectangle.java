package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, side A " + sideA
                + " units, side B: " + sideB + " units, color: " + color);
    }
}
