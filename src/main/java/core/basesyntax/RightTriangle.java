package core.basesyntax;

public class RightTriangle extends Figure {

    private int sideA;

    RightTriangle(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(sideA, 2);
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: " + getArea() + ", side: "
                + sideA + ", color: " + getColor();
    }
}
