package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;
    private final String name = "RightTriangle";

    public RightTriangle(int firstSide, int secondSide, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, FirstSide: "
                + firstSide + ", SecondSide: " + secondSide + ", color: " + getColor());
    }
}
