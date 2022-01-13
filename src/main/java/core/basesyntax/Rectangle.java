package core.basesyntax;

public class Rectangle extends Figures {
    private int sideA;
    private int sideB;
    private final String name = "rectangle";

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, side A: " + sideA
                + " units, side B: " + sideB
                + " units, color: " + getColor();
    }
}
