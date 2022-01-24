package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {

    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return "Figure: rectangle. Width: " + width + " mm." + " Hetght: " + height
                + "mm. Area: " + getArea() + " sq.mm. Color: " + getColor();
    }
}
