package core.basesyntax;

public class Rectangle extends Figure {
    protected double width;
    protected double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getParameters() {
        return "width: " + String.format("%.2f", width) + " units, "
                + "height: " + String.format("%.2f", height) + " units";
    }
}
