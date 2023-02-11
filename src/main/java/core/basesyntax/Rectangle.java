package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea() + " sq.units, height: "
                + height + " units, width: "
                + width + " units, color: "
                + getColor().name().toLowerCase());

    }
}
