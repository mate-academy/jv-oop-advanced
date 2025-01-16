package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.2f", getArea())
                + " sq. units, width: " + String.format("%.2f", width)
                + " units, height: "
                + String.format("%.2f", height)
                + " units, color: " + super.color);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
