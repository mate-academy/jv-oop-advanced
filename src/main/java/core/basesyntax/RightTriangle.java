package core.basesyntax;

public class RightTriangle extends Shape {
    private final int side;

    public RightTriangle(int side, String color) {
        super(color);
        this.side = side;
        float valueOfArea = countArea();
    }

    @Override
    public float countArea() {
        return (float) (side * side * Math.sqrt(3.0 / 4.0));
    }

    @Override
    public void draw() {
        System.out.printf("RightTriangle, area: %.2f sq.units,"
                        + " side: %d units, color: " + getColor() + "\n",
                        countArea(), side);
    }
}
