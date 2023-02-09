package core.basesyntax;

public class Square extends Figure {
    private double sideSize;

    public Square(double sideSize) {
        super();
        this.sideSize = sideSize;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.1f sq.units, side: %.1f units, color: %s",
                area(), sideSize, color.toLowerCase());
    }

    @Override
    public double area() {
        return sideSize * sideSize;
    }

}
