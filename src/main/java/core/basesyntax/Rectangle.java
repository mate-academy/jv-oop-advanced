package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private String color;
    private final int length;
    private final int width;

    protected Rectangle(String color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: rectangle, area: " + this.getArea() + ", length: " + this.length
                + ", width: " + this.width + " color " + this.color + ".");
    }
}
