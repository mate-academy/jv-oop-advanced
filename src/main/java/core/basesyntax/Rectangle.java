package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color, FigureList.RECTANGLE.name());
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getFigureData() {
        return "length: " + length + " units width: " + width + " units";
    }
}
