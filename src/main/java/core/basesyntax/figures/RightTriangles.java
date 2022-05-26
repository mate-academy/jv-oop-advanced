package core.basesyntax.figures;

import core.basesyntax.AreaFigure;
import core.basesyntax.Figure;

public class RightTriangles extends Figure implements AreaFigure {
    private int sideA;
    private int sideB;

    public RightTriangles(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle"
                + ", area: " + getArea() + " sq.units,"
                + " sideA: " + getSideA() + " units,"
                + " sideB: " + getSideB() + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
