package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double countArea() {
        return height * width;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: rectangle, area: " + countArea() + " sq.units, height:"
                + height + " units, width: " + width + " units, color: " + color);
    }
}
