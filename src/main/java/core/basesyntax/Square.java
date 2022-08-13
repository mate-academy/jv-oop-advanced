package core.basesyntax;

public class Square implements Figure {
    private int sideA;
    private String color;

    public Square(int sideA, String color) {
        this.sideA = sideA;
        this.color = color;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
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
        return "Figure: square, area: "
                + sideA * sideA
                + " sq.units, side: "
                + sideA
                + " units, color: "
                + color;
    }
}
