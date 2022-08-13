package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private int sideA;
    private int sideB;
    private int height;
    private String color;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
        return "Figure: isoscelesTrapezoid, area: "
                + (sideA * sideB) * 0.5 * height
                + " sq.units, sideA: "
                + sideA
                + " units, sideB: "
                + sideB
                + " units, height: "
                + height
                + " units, color: "
                + color;
    }
}
