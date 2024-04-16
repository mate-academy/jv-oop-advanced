package core.basesyntax;

public class Square extends Figure {
    private final int side;
    private String color;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double areaCalculation() {
        return (double) side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, "
                + "side: " + side + " units"
                + ", area: " + areaCalculation() + " sq. units"
                + ", color: " + getColor());
    }
}
