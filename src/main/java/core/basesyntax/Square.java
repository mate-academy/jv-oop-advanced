package core.basesyntax;

public class Square extends Figure {
    private int sideA;

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
