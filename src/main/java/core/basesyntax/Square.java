package core.basesyntax;

public class Square extends Figure implements State {
    private final double sideLen;
    private String color;

    public Square(double side) {
        this.sideLen = side;
        color = BLACK;
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

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String uniqueProperty() {
        return String.format("side length: %f units", sideLen);
    }
}
