package core.basesyntax;

public class Square extends Figure implements State {
    private double sideLen;
    private String color;

    public Square(double side) {
        if (side > 0) {
            this.sideLen = side;
            color = RED;
        } else {
            System.out.println("Side cannot be less than 0 or equal 0");
        }
    }

    @Override
    public double countArea() {
        return sideLen * sideLen;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: square, area %f sq. units, %s, color %s\n",
                countArea(), uniqueProperty(), color);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String uniqueProperty() {
        return String.format("side length: %f units", sideLen);
    }
}
