package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(Color color, double width, double length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, " + "area: " + area() + "sq.units, "
                + "width: " + this.width + "length: " + this.length + " units, "
                + "color: " + this.getColor());
    }

    @Override
    public double area() {
        return length * width;
    }
}

