package core.basesyntax;

public class Square extends Figure {

    private int sideA;

    Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;

    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + ", side: "
                + sideA + ", color: " + getColor();
    }

}
