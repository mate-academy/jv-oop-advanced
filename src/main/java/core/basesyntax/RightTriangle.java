package core.basesyntax;

public class RightTriangle extends Shape {
    private int side;

    public RightTriangle(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double countArea() {
        return (side * side * Math.sqrt(3.0 / 4.0));

    }

    @Override
    public void draw() {
        System.out.println("RightTriangle, area: " + countArea() + " sq.units,"
                        + " side: " + side + " units, color: " + getColor());
    }
}
