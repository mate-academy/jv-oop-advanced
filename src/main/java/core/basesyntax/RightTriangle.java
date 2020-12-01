package core.basesyntax;

public class RightTriangle extends Figure implements HasHeight {
    private double side;

    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0.5 * side * getHeight();
    }

    @Override
    public void infoAboutFigure() {
        System.out.printf("Shape: right triangle, area: %.3f sq. units, side length: %s units,"
                + " height: %.3f units, color: %s", getArea(), side, getHeight(), getColor());
        System.out.println();
    }

    @Override
    public void drawFigure() {
        System.out.println(" You draw " + getColor() + " right triangle!");
    }

    @Override
    public double getHeight() {
        return side * Math.sqrt(3) / 2;
    }
}
