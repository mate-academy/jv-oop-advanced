package core.basesyntax;

public class RightTriangle extends Figure {
    private final int katetOne;
    private final int katetTwo;

    public RightTriangle(int katetOne, int katetTwo, String color) {
        this.katetOne = katetOne;
        this.katetTwo = katetTwo;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (katetOne * katetTwo) / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, side a: "
                + katetOne + ", side b: " + katetTwo + " units, color:" + getColor());
    }
}
