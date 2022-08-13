package core.basesyntax;

public class Rectangle implements Figure {

    private int sideA;
    private int sideB;
    private String color;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void toDraw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: "
                + sideA * sideB
                + " sq.units, sideA: "
                + sideA
                + " units, sideB: "
                + sideB
                + " units, color: "
                + color;
    }
}
