package core.basesyntax;

public class Square extends Figure {
    private final double sideLen;

    public Square(double side, Color color) {
        super(color);
        this.sideLen = side;
    }

    @Override
    public double calculateArea() {
        return sideLen * sideLen;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: square, area %f sq. units, %s, color %s\n",
                calculateArea(), uniqueProperty(), color);
    }

    public String uniqueProperty() {
        return String.format("side length: %f units", sideLen);
    }
}
