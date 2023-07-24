package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private final Color rectangleColor;

    public Rectangle(Color randomColor, double length, double width) {
        super(Parameters.DEFAULT_COLOR);
        this.length = length;
        this.width = width;
        this.rectangleColor = randomColor;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq.units, length: "
                + length
                + " units, width: "
                + width
                + " units, color: "
                + rectangleColor);
    }
}
