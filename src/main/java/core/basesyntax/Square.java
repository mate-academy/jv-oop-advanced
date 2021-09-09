package core.basesyntax;

public class Square extends ColorSupplier implements Figure {
    private int side;

    public void setParameters(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String behaviour() {
        return "Figure: square, area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + getRandomColor();
    }
}
