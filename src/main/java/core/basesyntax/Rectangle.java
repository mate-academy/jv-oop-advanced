package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(Color color, double witdth, double height) {
        super(color);
        this.height = height;
        this.width = witdth;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.2f", area())
                + " sq.units, height: "
                + height
                + " units, witdth:"
                + width
                + " color: "
                + getColor().name());
    }
}
