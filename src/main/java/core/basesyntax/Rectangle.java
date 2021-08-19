package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
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

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getInformation() {
        return "Figure: rectangle, area: " + new DecimalFormat("#.#").format(getArea())
                + " sq.units, sideA: " + sideA + " units, sideB: " + sideB
                + " units, color: " + getColor();
    }
}
